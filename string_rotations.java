# String Rotations

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "ABCD";
		String sNew = s+s;
		int l1 = s.length();
		int l2 = sNew.length();
		for(int i=0;i<l1;i++){
			String temp = sNew.substring(i, i+l1);
			System.out.print(temp+" ");
		}
	}
}