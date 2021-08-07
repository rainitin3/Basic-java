package collection;
import java.util.*;
public class TreeSet1 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t1 = new TreeSet<Integer>(new MyComparator());
		t1.add(60);
		t1.add(30);
		t1.add(50);
		t1.add(20);
		t1.add(10);
		t1.add(0);
		
		
		System.out.println(t1);
//		System.out.println(t1.ceiling(25));
//		System.out.println(t1.first());
//		System.out.println(t1.floor(10));
//		System.out.println(t1.last());
//		System.out.println(t1.pollFirst());
//		System.out.println(t1);
//		System.out.println(t1.pollLast());
//		System.out.println(t1);
//	
	
	}
	}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer a=(Integer) obj1;
		Integer b=(Integer) obj2;
		return  -a.compareTo(b);
		//return -1;
		
	}
	}


