package assignment;

import java.util.ArrayList;

public class CopyingArrayListToAnother {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		ArrayList<String> l1=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		l1.addAll(l);
		System.out.println(l1);
		
	}
	
}
