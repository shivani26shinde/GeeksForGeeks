# Minimum number of jumps to reach end

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Jumps(int[] arr){
		int[] array = new int[arr.length];
		array[0] = 0;
		for(int i=1;i<array.length;i++){
			array[i] = Integer.MAX_VALUE;
			for(int j=0;j<i;j++){
				if(i<=j+arr[j] && array[j] != Integer.MAX_VALUE){
					array[i] = Math.min(array[i], array[j] + 1);
				}
			}
		}
		return array[array.length-1];
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[]{1, 3, 6, 1, 0, 9};
		System.out.println(Jumps(array));
	}
}