package assignment;

import java.util.TreeSet;

public class TreeSetQ6 {

	public static void main(String[] args)
	{
		TreeSet<String> l=  new TreeSet();
			l.add("Black");
			l.add("Red");
			l.add("White");
			l.add("Blue");
			System.out.println(l);
		TreeSet<String> l2=  (TreeSet<String>)l.clone();
			System.out.println(l2);
		
	}


	
}
