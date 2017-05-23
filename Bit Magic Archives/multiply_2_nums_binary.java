# Multiply two numbers (Bit's)

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Multiply(int m, int n){
		int count = 0;
		int ans = 0;
		while(m!=0){
			if(m%2 == 1){
				ans = ans+(n<<count);
			}
			count++;
			m = m/2;
		}
		return ans;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Multiply(15,10));
	}
}