package assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class IteratingLinkedList {

	
	public static void main(String[] args)
	{
		LinkedList<String> l=  new LinkedList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		for(String str: l)
		{
			System.out.println(str);
		}
		
	}
}
