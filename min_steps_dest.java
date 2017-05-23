# Minimum steps to destination

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int target = 11;
	public static int MinSteps(int start, int steps){
		if(start == target){
			return steps;
		}
		if(start>target){
			return Integer.MAX_VALUE;
		}
		int right = MinSteps(start+steps);
		int left = MinSteps(start-steps);
		
		return Math.min(right,left);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(MinSteps(0,1));
	}
}