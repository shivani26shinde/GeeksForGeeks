# Subset Sum using bits

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static int[] array = new int[]{1,2,3};
	static int[] query = new int[]{5,3,8};
	static ArrayList<String> list = new ArrayList<>();
	public static ArrayList<String> Check(){
		int bit = 1;
		for(int i=0;i<array.length;i++){
			bit = bit|(bit<<array[i]);
		}
		for(int i=0;i<query.length;i++){
			if((bit & (1<<query[i])) > 0){
				list.add("YES");
			}
			else{
				list.add("NO");
			}
		}
		return list;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Check();
		System.out.println(Arrays.toString(list.toArray()));
	}
}