package assignment;

import java.util.HashSet;

public class HashSetQ7 {

	public static void main(String[] args)
	{
		HashSet<String> l=  new HashSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");	
		System.out.println(l);
		
	 String arr[]= new String[l.size()];
		l.toArray(arr);
		for(String str: arr) {
		System.out.println(str);
		
	}
	}
}
