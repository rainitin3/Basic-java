package collection;
import java.util.*;

public class TreeSet2
{
	public static void main(String[] args)
	{
		TreeSet<String> t2 = new TreeSet<String>(new MyComparators());
		t2.add("rahul");
		t2.add("nitin");
		t2.add("anil");
		t2.add("pravin");
		t2.add("suresh");
		System.out.println(t2);
	}
}
class MyComparators implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1= obj1.toString();
		String s2= obj2.toString();
		return s1.compareTo(s2);
		
	}
}
