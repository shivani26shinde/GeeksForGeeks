# Minimum deletion/insertion for a string conversion into another string

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void Count(String s1, String s2){
		int a = s1.length();
		int b = s2.length();
		int[][] array = new int[a+1][b+1];
		for(int i=0;i<=a;i++){
			for(int j=0;j<=b;j++){
				if(i ==0 || j==0){
					array[i][j] = 0;
				}
				else if(s1.charAt(i-1) != s2.charAt(j-1)){
					array[i][j] = Math.max(array[i-1][j], array[i][j-1]);
				}
				else{
					array[i][j] = 1 + array[i-1][j-1];
				}
			}
		}
		int val = array[a][b];
		if(a>b){
			System.out.println("Deletions: "+(a-val)+" Insertions: "+(b-val));
		}
		else{
			System.out.println("Deletions: "+(b-val)+" Insertions: "+(a-val));
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1 = "geeksforgeeks";
		String s2 = "geeks";
		Count(s1,s2);
	}
}