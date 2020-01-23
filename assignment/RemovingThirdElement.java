package assignment;

import java.util.ArrayList;

public class RemovingThirdElement {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
	}
}
