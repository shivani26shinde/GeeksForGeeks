# Insertion Sort - Recursive

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int[] array = new int[]{4,2,1,5,2,1,6,3,7,6};
	public static void main (String[] args) throws java.lang.Exception
	{
		Recur(array, array.length);
		System.out.println(Arrays.toString(array));
	}
	public static void Recur(int[] array, int n){
		if(n<=1){
			return;
		}
		Recur(array,n-1);
		int last = array[n-1];
		int j = n-2;
		while(j>=0 && array[j] > last){
			array[j+1] = array[j];
			j--;
		}
		array[j+1] = last;
	}
}