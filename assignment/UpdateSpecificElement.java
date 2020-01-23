package assignment;

import java.util.ArrayList;

public class UpdateSpecificElement {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		
		String str = l.set(2, "Grey");
		System.out.println(l);
		
	}
	
	
}
