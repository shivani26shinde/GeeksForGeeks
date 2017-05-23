# Toggle k'th bit of a number

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int k = 4;
	public static int Toggle(int n){
		StringBuilder sb = new StringBuilder();
		int x=1;
		while(x != k){
			sb.append((n&1));
			n = n>>1;
			x++;
		}
		if((n&1) == 1){
			sb.append(0);
		}
		else{
			sb.append(1);
		}
		n = n>>1;
		while(n != 0){
			sb.append((n&1));
			n = n>>1;
		}	
		String s = sb.reverse().toString();
		return Integer.parseInt(s,2);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Toggle(2));
	}
}