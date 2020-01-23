package assignment;

import java.util.ArrayList;

public class PrintingIndex {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		for(int index=0;index<l.size();index++)
		System.out.println(l.get(index));
		
	}
}
