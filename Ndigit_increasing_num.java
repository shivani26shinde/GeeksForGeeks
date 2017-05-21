# N-digit increasing numbers

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void Addition(int start, String s, int n){
		if(n==0){
			System.out.print(s+" ");
			return;
		}
		for(int i=start;i<=9;i++){
			String temp = s+String.valueOf(i);
			Addition(i+1, temp, n-1);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Addition(0, "", 2);
	}
}