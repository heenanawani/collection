package assignment;

import java.util.HashSet;

public class HashMapQ11 {

	public static void main(String[] args)
	{
		HashSet<String> l1=  new HashSet();
		HashSet<String> l2=  new HashSet();
		l1.add("Black");
		l1.add("Red");
		l1.add("White");
		l1.add("Blue");
		System.out.println(l1);
		l2.add("White");
		l2.add("Blue");
		l2.add("orange");
		System.out.println(l2);
		
		l1.retainAll(l2);
		System.out.println(l1);
		
	}
	
	
}
