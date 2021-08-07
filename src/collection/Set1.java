package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 
{
	public static void main(String[] args)
	{
		Set set1 = new HashSet();
		
		set1.add(25); 
		set1.add("hello");
		set1.add(65);
		set1.add(20);
		set1.add(null);
		set1.add("naveen");
		System.out.println(set1);
		
		Iterator itr=set1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
