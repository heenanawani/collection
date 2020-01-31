package assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetQ6 {

	public static void main(String[] args)
	{
	HashSet<String> l1=  new HashSet();
		l1.add("Black");
		l1.add("Red");
		l1.add("White");
		l1.add("Blue");
		System.out.println(l1);
	HashSet<String> l2=   (HashSet<String>) l1.clone() ;
	    System.out.println(l2);
		
	}
}
