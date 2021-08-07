package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l1= new ArrayList<>();
		
		l1.add(30);	
		l1.add(40);	
		l1.add(10);	
		l1.add(20);	
		l1.add(55);	
		l1.add(64);	
		l1.add(35);	
		l1.add(50);
		System.out.println("---------list elements---------");
		
		for(int i:l1)
		{
			System.out.println(i);
		}
		
		Iterator it2=l1.iterator();
		
		while(it2.hasNext()) 
		{
			int j = (int) it2.next();
			if(j==20)
			{
			it2.remove();
			
			}
		}
		
		System.out.println("-----------after remove------------");
		for(int i:l1)
		System.out.println(i);
	}
	

}
