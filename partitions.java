# Partitions

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static String s = "nitin";
	public static void Partitions(String temp, int start){
		if(isPalindrome(temp) == true){
			System.out.print(temp+" ");
		}
		for(int i=start; i<s.length();i++){
			String temp = s.substring(start, i+1);
			Partitions(temp, i+1);
		}
	}
	public static boolean isPalindrome(String s){
		int left = 0;
		int right = s.length()-1;
		if(s == ""){
			return false;
		}
		while(left<right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Partitions("", 0);
	}	
}