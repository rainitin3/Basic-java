package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList3 
{
	public static void main(String[] args)
	{
		List<String> a1=new ArrayList<>();
		a1.add("nokia");
		a1.add("micromax");
		a1.add("xiomi");
		a1.add("realme");
		a1.add("oppo");
		a1.add("vivo");
		
		for(String i:a1)
		{
		System.out.println(i);
		}
		System.out.println("------------------------------------------------------");
		ListIterator li = a1.listIterator();
		
		while(li.hasNext())
		{
			 String s1 = (String) li.next();
			 if(s1.equals("oppo")) 
			 {
				 li.remove();                          //for remove element
			 }
			 else if(s1.equals("xiomi"))
			 {
				li.set("oneplus");                     //for replace element
			 }
			 else if(s1.equals("vivo"))
			 {
				 li.add("intex");                     //for add element
			 }
			 
			
		}
		System.out.println(a1);
		
	}

}
