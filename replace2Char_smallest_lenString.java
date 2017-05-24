# Smallest length string with repeated replacement of two distinct adjacent

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Count(String s){
		int a=0;
		int b=0;
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'a'){
				a++;
			}
			else if(s.charAt(i) == 'b'){
				b++;
			}
			else{
				c++;
			}
		}
		if(a==s.length()||b==s.length()||c==s.length()){
			return s.length();
		}
		if((a%2) == (b%2) && (b%2) == (c%2)){
			return 2;
		}
		return 1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Count("abcabc"));
	}
}