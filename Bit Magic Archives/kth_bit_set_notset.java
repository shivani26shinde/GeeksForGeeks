# K-bit set/not-set

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int k = 3;
	public static String SetBit(int n){
		if((n&(1<<(k-1))) == 1){
			return "SET";
		}
		else{
			return "NOT SET";
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(SetBit(2));
	}
}