# Maximum square sub-matrix ith all same values

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int n = 4;
	public static int Max(int[][] array){
		int max = 1;
		int[][]arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = 1;
			}
		}
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				if(array[i-1][j-1] == array[i-1][j] && array[i-1][j] == array[i][j-1]){
					arr[i][j] = Math.min(arr[i-1][j-1],Math.min(arr[i-1][j], arr[i][j-1])) + 1;
					max = Math.max(max, arr[i][j]);
				}
			}
		}
		return max;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[][] = {{9, 9, 9, 8},
                  {9, 9, 9, 6},
                  {9, 9, 9, 3},
                  {2, 2, 2, 2}};
        System.out.println(Max(a));
	}
}