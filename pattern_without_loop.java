# Print pattern without loop

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int target = 16;
	
	// Using single recursive function
	public static void Number(int n){
		if(n<=0){
			System.out.println(n);
			return;
		}
		System.out.println(n);
		Number(n-5);
		System.out.println(n);
		
	}
	
	// Using nested recursive functions
	public static void Number1(int n){
		if(n<=0){
			System.out.println(n);
			Number2(n+5);
			return;
		}
		System.out.println(n);
		Number1(n-5);
		
	}
	public static void Number2(int n){
		if(n==target){
			System.out.println(n);
			return;
		}
		System.out.println(n);
		Number2(n+5);
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		//Number1(target);
		//Number(target);
	}
}