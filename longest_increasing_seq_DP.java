# Longest Increasing Sequence

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int LongIncrSeq(int[] arr){
		int[] array = new int[arr.length];
		for(int i=0;i<array.length;i++){
			array[i] = 1;
		}
		int max = 0;
		for(int i=1;i<array.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					array[i] = Math.max(array[j]+1, array[i]);
				}
			}
			max = Math.max(max, array[i]);
		}
		return array.length-max;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = new int[]{5, 6, 1, 7, 4};
		System.out.println(LongIncrSeq(arr));
	}
}