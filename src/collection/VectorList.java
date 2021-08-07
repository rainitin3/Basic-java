package collection;


import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorList
{
	public static void main(String[] args) 
	{
		List<String> v1= new Vector<String>();
		
		v1.add("java");
		v1.add("c");
		v1.add("pearl");
		v1.add("c++");
		v1.add("python");
		v1.add("javaScript");
		v1.add("html");
		System.out.println(v1);
		System.out.println("elements are--------- -- ");
		
		System.out.println(v1);
		
		 Iterator<String> it1 = v1.iterator();
		 
	    
	    while(it1.hasNext())
	    {
	    	String str= (String) it1.next();
	    	if(str.equals("python"))
	    	{
	    		it1.remove();
	    		
	    	}
	    	
	    	
	    }
	    
	    System.out.println("elements after remove----------");
	    System.out.println(v1);
	    
	    
		
	    
	}

}
