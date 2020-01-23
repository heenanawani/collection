package assignment;

import java.util.ArrayList;

public class ToCheckAnEmptyArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		l.removeAll(l);
		if(l.isEmpty())
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println(" not empty");
		}
		
	}
	
	
}
