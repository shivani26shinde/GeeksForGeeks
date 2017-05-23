# 2's Complement in single traversal

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static String complement(String s){
		int carry = 0;
		int x = s.length()-1;
		StringBuilder sb =  new StringBuilder();
		if(s.charAt(x) == '1'){
			carry = 0;
			sb.append(1);
			x--;
			while(x>=0){
				if(s.charAt(x) == '1'){
					sb.append(0);
				}
				else{
					sb.append(1);
				}
				x--;
			}
			return sb.reverse().toString();
		}
		else{
			carry = 1;
			sb.append(0);
			x--;
		}
		while(s.charAt(x) != '1' && carry == 0){
			sb.append(0);
			carry = 1;
			x--;
		}
		carry = 0;
		if(s.charAt(x) == '1' && carry == 0){
			sb.append(1);
			carry = 0;
			x--;
		}
		while(x>=0){
			if(s.charAt(x) == '1'){
				sb.append(0);
			}
			else{
				sb.append(1);
			}
			x--;
		}
		if(x<0 && carry == 1){
			sb.append(1);
		}
		return sb.reverse().toString();
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "00000101";
		System.out.println(complement(s));
	}
}