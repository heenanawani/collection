package assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetQ8 {

	public static void main(String[] args)
	{
		HashSet<String> l=  new HashSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		Set<String> s= new TreeSet(l);
		System.out.println(s);
		
	}
	
	
}
