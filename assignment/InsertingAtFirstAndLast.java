package assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class InsertingAtFirstAndLast {

	public static void main(String[] args)
	{
		LinkedList<String> l=  new LinkedList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		l.addFirst("Purple");
		l.addLast("Purple");
		System.out.println(l);
		
	}
}
