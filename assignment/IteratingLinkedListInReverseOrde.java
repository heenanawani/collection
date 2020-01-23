package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedListInReverseOrde {

	public static void main(String[] args)
	{
		LinkedList<String> l=  new LinkedList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
}
