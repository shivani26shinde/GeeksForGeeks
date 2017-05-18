# Sort array according to lengths

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	static String[] str = new String[]{"You", "are", "beautiful", "looking"};
	public static void main (String[] args) throws java.lang.Exception
	{
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		for(int i=0;i<str.length;i++){
			String temp = str[i];
			if(map.containsKey(temp.length())){
				ArrayList<String> s = map.get(temp.length());
				s.add(temp);
				map.put(temp.length(), s);
			}
			else{
				ArrayList<String> s = new ArrayList<>();
				s.add(temp);
				map.put(temp.length(), s);
			}
		}
		HashSet<Integer> set = new HashSet<Integer>(map.keySet());
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		ArrayList<String> listFinal = new ArrayList<>();
		for(int i=0;i<list.size();i++){
			ArrayList<String> s = map.get(list.get(i));
			for(int j=0;j<s.size();j++){
				listFinal.add(s.get(j));
			}
		}
		System.out.println(Arrays.toString(listFinal.toArray()));
	}
}