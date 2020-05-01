package pkg1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setcollection 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer> (); // Storing the value of object types for a class
		hs.add(123);
		hs.add(1234);
		hs.add(122);
		hs.add(133);
		hs.add(12324);
		hs.add(1234);
		
		for (Integer i : hs) // : means each
		{
			System.out.println(i);
		}
		
		System.out.println("******* first line********");
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer> (); // Storing the value of object types for a class
		lhs.add(123);
		lhs.add(1234);
		lhs.add(122);
		lhs.add(133);
		lhs.add(12324);
		lhs.add(1234);
		
		for (Integer i : lhs)
		{
			
			System.out.println(i);
		}
		System.out.println("******* second line********");
		TreeSet<Integer> ths = new TreeSet<Integer> (); // Storing the value of object types for a class
		ths.add(123);
		ths.add(1234);
		ths.add(122);
		ths.add(133);
		ths.add(12324);
		ths.add(1234);
		
		for (Integer i : ths)
		{
			
			System.out.println(i);
		}
	}

}
