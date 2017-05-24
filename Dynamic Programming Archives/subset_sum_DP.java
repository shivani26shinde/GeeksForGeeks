# Subset Sum Problem

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static boolean Check(int[] arr, int sum){
		boolean[][] array = new boolean[arr.length+1][sum+1];
		for(int i=0;i<=sum;i++){
			array[0][i] = false;
		}
		for(int i=0;i<=arr.length;i++){
			array[i][0] = false;
		}
		for(int i=1;i<=arr.length;i++){
			for(int j=1;j<=sum;j++){
				array[i][j] = array[i-1][j];
				if(arr[i-1] == j){
					array[i][j] = true;
				}
				else if(j>arr[i-1]){
					array[i][j] = (array[i][j] || array[i-1][j-arr[i-1]]);
				}
			}
		}
		return array[arr.length][sum];
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = new int[]{3, 34, 4, 12, 5, 2};
		System.out.println(Check(arr, 26));
	}
}