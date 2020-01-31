package assignment;

import java.util.TreeSet;

public class TreeSetQ8 {
	public static void main(String[] args)
	{
		TreeSet<String> l=  new TreeSet();
		TreeSet<String> l2=  new TreeSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		l2.add("White");
		l2.add("Blue");
		l.retainAll(l2);
		System.out.println(l);
		
	}
	
}
