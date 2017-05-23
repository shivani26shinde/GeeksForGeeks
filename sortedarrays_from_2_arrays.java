# All possible sorted arrays from two sorted arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void SortedArrays(int i, int j, int m, int n, int len, int[]A, int[] B, int[] C, boolean flag){
		if(flag == true){
			if(len%2 == 1){
				System.out.println(Arrays.toString(C));
			}
			for(int y=i;y<m;y++){
				if(len == 0){
					C[len] = A[y];
					flag = true;
					SortedArrays(y+1,j,m,n,len,A,B,C,flag);
				}
				else{
					if(A[y] >C[len]){
						C[len+1] = B[x];
						flag = true;
						SortedArrays(y+1,j,m,n,len+1,A,B,C,flag);
					}
				}
			}
		}
		else{
			for(int x=j;x<n;x++){
				if(B[x] > C[len]){
					C[len+1] = B[x];
					flag = false;
					SortedArrays(i,x+1,m,n,len+1,A,B,C,flag);
				}
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] A = {10, 15, 25};
		int[] B = {1, 5, 20, 30};
		boolean flag = true;
		SortedArrays(0,0,a.length,b.length,0,A,B,C,flag);
	}
}