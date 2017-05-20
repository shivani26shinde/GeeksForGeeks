# Binary strings without consecutive one's

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static ArrayList<String> Count(int n){
		ArrayList<String> newList = new ArrayList<>();
		if(n == 1){
			newList.add("1");
			newList.add("0");
			return newList;
		}
		ArrayList<String> ret = Count(n-1);
		for(int i=0;i<ret.size();i++){
			String temp = ret.get(i);
			if(temp.charAt(temp.length() - 1) != '1'){
				String one = temp+'1';
				newList.add(one);
			}
			String two = temp+'0';
			newList.add(two);
		}
		return newList;
	} 
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> newList = Count(3);
		System.out.println(Arrays.toString(newList.toArray())+"  "+newList.size());
	}
}