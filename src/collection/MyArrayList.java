package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyArrayList 
{
	public static void main(String[] args) {
		
	List<String> fruits = new ArrayList<>();
	ArrayList<Integer> rate = new ArrayList<>();
	fruits.add("banana");     //1
	fruits.add("papaya");
	fruits.add("apple");
	fruits.add("orange");
	fruits.add(2, "lichi");   //2
	fruits.toArray();         //3
	fruits.remove("orange");   //4
	
	rate.add(20);
	rate.add(56);
    rate.add(45);
    rate.add(26);
    rate.add(12);
    rate.set(2,65 );
  
    
    
	System.out.println(fruits);
	System.out.println("contain apple= "+fruits.contains("apple"));   //5
	System.out.println(fruits.indexOf("banana"));                       //6
	System.out.println("hashcode "+fruits.hashCode());                  //7
	System.out.println(rate.size());                                   //8
	                                                
	System.out.println(fruits.contains("banana"));                    //9
	System.out.println(fruits.isEmpty());                              //10
	System.out.println(rate.get(4));                                  //11
	System.out.println(rate);                                         //12
	Collections.sort(rate);                                           //13
	Collections.sort(fruits);
	System.out.println(rate);
	System.out.println(fruits);
	System.out.println(rate.indexOf(20));
	
	
	
	
	 
	}

}
