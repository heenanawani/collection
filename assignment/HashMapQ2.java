package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class HashMapQ2 {

	public static void main(String[] args)
	{
		HashSet<String> l=  new HashSet();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		Iterator <String> i = l.iterator();
		
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	}
	
}
