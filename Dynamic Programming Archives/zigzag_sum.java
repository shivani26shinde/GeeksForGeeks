# Largest zig-zag sequence sum

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Sum(int[][] arr, int i, int j, int n){
		if(i == n-1){
			return arr[i][j];
		}
		int sum = 0;
		for(int k=0;k<n;k++){
			sum = Math.max(sum, Sum(arr, i+1, k, n));
		}
		return sum+arr[i][j];
	}
	public static int CheckSum(int[][] arr, int n){
		int sum = 0;
		for(int k=0;k<n;k++){
			sum = Math.max(sum, Sum(arr, 0, k, n));
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] array = {{4, 2, 1},{3, 9, 6},{11, 3, 15}};
		System.out.println(CheckSum(array,3));
	}
} 