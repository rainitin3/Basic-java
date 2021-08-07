package collection;


import java.util.Enumeration;
import java.util.Stack;

public class StackList
{
	public static void main(String[] args) 
	{
		Stack<Integer> l1= new Stack<>();
		
		l1.push(11);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		
		System.out.println(l1);
		
		l1.pop();
		System.out.println(l1);
		l1.peek();
		System.out.println(l1);
		
		System.out.println(l1.search(20));

		System.out.println(l1.peek());
		
		Enumeration e=l1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}

}
