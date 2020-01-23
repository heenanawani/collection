package assignment;

import java.util.ArrayList;

public class CompareTwoArrayLists {

	public static void main(String[] args)
	{
		ArrayList<String> l1=  new ArrayList();
		ArrayList<String> l2=  new ArrayList();
		l1.add("Black");
		l1.add("Red");
		l1.add("White");
		l1.add("Blue");
		l2.add("Red");
		l2.add("Orange");
		l2.add("Grey");
		l2.add("Black");
		System.out.println(l1);
		System.out.println(l2);
		l2.retainAll(l1);
		System.out.println(l2);
		
	}
}
