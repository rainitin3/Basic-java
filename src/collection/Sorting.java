package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		ArrayList<String> list2= new ArrayList<String>();
		
		
		list.add(52);
		list.add(56);
		list.add(98);
		list.add(152);
		list.add(25);
		list.add(12);
		
		list2.add("hello");
		list2.add("rohit");
		list2.add("vijay");
		list2.add("amit");
		list2.add("chirag");
		list2.add("suman");
		
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
