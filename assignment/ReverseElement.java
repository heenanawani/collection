package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElement {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
	
		System.out.println(l);
		Collections.reverse(l);

		System.out.println(l);
	}
}
