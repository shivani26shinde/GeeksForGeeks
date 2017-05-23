# Alternate bits pattern

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static boolean flag;
	public static String Check(int n){
		if((n&1) == 1){
			flag = false;
		}
		else{
			flag = true;
		}
		n = n>>1;
		while(n!=0){
			if((n&1) == 1 && flag == true){
				flag = false;
			}
			else if((n&1) == 0 && flag == false){
				flag = true;
			}
			else{
				return "NO";
			}
			n = n>>1;
		}
		return "YES";
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(Check(15));
	}
}