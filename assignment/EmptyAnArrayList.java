package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmptyAnArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		l.removeAll(l);
		System.out.println(l);
		
	}
	
}
