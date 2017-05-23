# Decimal fraction to binary number

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int k=3;
	public static String Binary(String s){
		String[] array = s.split(".");
		int a = Integer.parseInt(array[0]);
		double b = 0.1*Integer.parseInt(array[1]);
		StringBuilder sb = new StringBuilder();
		while(a!=0){
			sb.append(a%2);
			a = a/2;
		}
		String temp1 = sb.reverse().toString();
		StringBuilder sb2 = new StringBuilder();
		int x = 0;
		while(x != k){
			b = b*2;
			if(b>1){
				sb2.append(1);
				b = b-1;
			}
			else{
				sb2.append(0);
			}
			x++;
		}
		String temp2 = sb2.toString();
		return temp1+'.'+temp2;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Binary("4.47"));
	}
}