# Longest Increasing Sequence -- O(NlogN)

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Check(int[] array, int l, int r, int val){
		while(r-l>1){
			int m = l+(r-l)/2;
			if(array[m]>=val){
				r=m;
			}
			else{
				l=m;
			}
		}
		return r;
	}
	public static int LongIncrSeqLessTime(int[] arr){
		int[] array = new int[arr.length];
		array[0] = 1;
		int len = 1;
		for(int i=1;i<array.length;i++){
			if(arr[i] < array[0]){
				array[0] = arr[i];
			}
			else if(arr[i] > array[len-1]){
				array[len] = arr[i];
				len++;
			}
			else{
				array[Check(array, -1, len-1, arr[i])] = arr[i];
			}
		}
		return len;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = new int[]{2, 5, 3, 7, 11, 8, 10, 13, 6 };
		System.out.println(LongIncrSeqLessTime(arr));
	}
}