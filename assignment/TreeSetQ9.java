package assignment;

import java.util.TreeSet;

public class TreeSetQ9 {
	public static void main(String[] args)
	{
		TreeSet<Integer> l=  new TreeSet();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		TreeSet<Integer> l2= (TreeSet<Integer>)l.headSet(8);
		System.out.println(l2);
	}
	
}
