package assignment;

import java.util.*;

public class IteratingFromSpecificElement {
	public static void main(String[] args)
	{
		LinkedList<String> l=  new LinkedList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		Iterator i= l.listIterator(1);
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}