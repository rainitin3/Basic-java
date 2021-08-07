package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetToList 
{
	public static void main(String[] args)
	{
		Set<Integer> hSet=new HashSet<>();
		hSet.add(40);
		hSet.add(50);
		hSet.add(20);
		hSet.add(80);
		hSet.add(55);
		hSet.add(60);
		System.out.println(hSet);
		
		List<Integer> aList= new ArrayList<>();
		for(int x:hSet)
		aList.add(x);
		
		System.out.println(aList);
		
		
		
	}


}
