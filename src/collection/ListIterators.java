package collection;

import java.util.ArrayList;

import java.util.*;

public class ListIterators
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("********************************");
		ListIterator ltr=list.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("--------------------------------");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
		
	} 

}
