package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset 
{
	public static void main(String[] args)
	{
		List<String>  l1 = new ArrayList<>();
		l1.add("pravin");
		l1.add("anil");
		l1.add("Nitin");
		l1.add("sidhdhant");
		l1.add("kedar");
		System.out.println(l1);

   Set<String> hSet = new HashSet<String>();
       for (String x : l1)
       hSet.add(x);

   System.out.println("=====Created HashSet is=====");
   //for (String x : hSet)
       System.out.println(hSet);
	}

}
