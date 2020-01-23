package assignment;

import java.util.ArrayList;

public class CloneAnArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		ArrayList<String> l1=  (ArrayList<String>) l.clone();
	//	l1.clone();
		System.out.println(l1);
		
	}
	
}
