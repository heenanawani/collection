package assignment;

import java.util.TreeSet;

public class TreeSetQ3 {

	public static void main(String[] args)
	{
		TreeSet<String> l=  new TreeSet();
		TreeSet<String> l2=  new TreeSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		l2.addAll(l);
		System.out.println(l2);
		
	}
}
