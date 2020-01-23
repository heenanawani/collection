package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExtractingPortion {
	
	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList();
		 List<String> l1= new ArrayList();
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
        l1=l.subList(1,3);
		System.out.println(l1);
		
	}

}
