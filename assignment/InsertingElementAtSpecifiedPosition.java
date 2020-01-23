package assignment;

import java.util.ArrayList;

public class InsertingElementAtSpecifiedPosition {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		l.add(0, "Grey");
		
		System.out.println(l);		
	}
}
