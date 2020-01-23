package assignment;

import java.util.ArrayList;

public class IncreaseSizeOfAnArray {

	public static void main(String[] args)
	{
		ArrayList<String> l=  new ArrayList<>(4);
		l.add("Black");
		l.add("Red");
		l.add("White");
		l.add("Blue");
		
		System.out.println(l);
		l.ensureCapacity(6);
		l.add("Grey");
		System.out.println(l);
		
	}
	
}
