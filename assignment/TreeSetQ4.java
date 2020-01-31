package assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetQ4 {

	public static void main(String[] args)
	{
		TreeSet<String> l=  new TreeSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		Iterator i= l.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
