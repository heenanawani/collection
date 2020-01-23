package assignment;

import java.util.ArrayList;

public class DisplayingElementsPosition {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		  
		for(int i=0; i<l.size();i++)
		System.out.println(i + " "+ l.get(i));
		
	}
	
}
