package assignment;

import java.util.ArrayList;

public class JoiningTwoArray {


	public static void main(String[] args)
	{
		ArrayList<String> l1=  new ArrayList();
		ArrayList<String> l2=  new ArrayList();
	//	ArrayList<String> l3=  new ArrayList();
		l1.add("Black");
		l1.add("Red");
		l1.add("White");
		l1.add("Blue");
		l2.add("Red");
		l2.add("Orange");
		l2.add("Grey");
		l2.add("Black");
	    l1.addAll(l2);
		
		System.out.println(l1);
		
	}
	
}
