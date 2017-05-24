# Division by 2 OR 3 OR decrement byt 1

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Check(int n, int[] array){
		if(n==1){
			return 0;
		}
		if(array[n] != -1){
			return array[n];
		}
		int res = Check(n-1, array);
		if(n%2==0){
			res = Math.min(res, Check(n/2, array));
		}
		if(n%3==0){
			res = Math.min(res, Check(n/3, array));
		}
		array[n] = 1+res;
		return array[n];
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		System.out.println(Check(10, array));
	}
}