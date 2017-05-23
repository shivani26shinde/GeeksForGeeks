# Consecutive increasing set bits

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static String ConseSetBit(int n){
		int curr = 0;
		int prev = Integer.MAX_VALUE;
		while(n!=0){
			if((n&1) == 1){
				curr++;
			}
			else{
				prev = curr;
				curr = 0;
			}
			if(curr>prev){
				return "NO";
			}
			n = n>>1;
		}
		return "YES";
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(ConseSetBit(13));
	}
}