# Maximum area of a rectangle using maximum histogram approach

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	// Maximum area histogram
	public static int MaxHist(int[] array){
		int max = 0;
		Stack<Integer> st = new Stack<Integer>();
		int i=0;
		while(i<array.length){
			if(st.isEmpty() || array[st.peek()] <= array[i]){
				st.push(i);
				i++;
			}
			else{
				int cal = 0;
				int top = st.pop();
				if(st.isEmpty()){
					cal = i*array[top];
				}
				else{
					cal = (i-st.peek()-1)*array[top];
				}
				max = Math.max(cal, max);
			}
		}
		while(!st.isEmpty()){
			int cal = 0;
			int top = st.pop();
			if(st.isEmpty()){
				cal = i*array[top];
			}
			else{
				cal = (i-st.peek()-1)*array[top];
			}
			max = Math.max(cal, max);
		}
		return max;
	}
	// Maximum area rectangle
	public static int MaxRect(int[][] input){
		int[] array = new int[input[0].length];
		for(int j=0;j<input[0].length;j++){
			array[j] = input[0][j];
		}
		int max = MaxHist(array);
		for(int i=1;i<input.length;i++){
			for(int j=0;j<input[0].length;j++){
				if(input[i][j] == 0){
					array[j] = 0;
				}
				else{
					array[j] = array[j] + input[i][j];
				}
			}
			max = Math.max(max, MaxHist(array));
		}
		return max;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] input = {{1,0,0,1,1,1},{1,0,1,1,0,1},{0,1,1,1,1,1},{0,0,1,1,1,1}};
		System.out.println(MaxRect(input));
	}
}