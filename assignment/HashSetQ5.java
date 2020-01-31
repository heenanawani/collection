package assignment;

import java.util.HashSet;

public class HashSetQ5 {

	

	public static void main(String[] args)
	{
		HashSet<String> l=  new HashSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		System.out.println(l.isEmpty());
		l.removeAll(l);
		System.out.println(l.isEmpty());
		
	}
}
