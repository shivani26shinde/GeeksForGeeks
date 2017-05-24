# Sum of all sub strings

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int Count(String s){
		int[] array = new int[s.length()];
		array[0] = Character.getNumericValue(s.charAt(0));
		int sum = array[0];
		for(int i=1;i<s.length();i++){
			array[i] = (i+1)*Character.getNumericValue(s.charAt(i)) + 10*array[i-1];
			sum=sum+array[i];
		}
		return sum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Count("1234"));
	}
}