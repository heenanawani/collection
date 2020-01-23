package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceTheSecondElement {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		Collections.swap(l, 1, 3);
		System.out.println(l);
		
	}
	
}
