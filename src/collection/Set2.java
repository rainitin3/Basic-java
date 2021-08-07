package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2
{
	public static void main(String[] args) 
	{ 
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(30);
		set1.add(20);
		set1.add(60);
		set1.add(50);
		set1.add(10);
		System.out.println(set1);
		
		Iterator itr=set1.iterator();
		while(itr.hasNext())
		{
			int a=(int) itr.next();
			if(a==60)
			{
				itr.remove();
				
			}
			
			
		}
		System.out.println(set1);
		
		
	}

}
