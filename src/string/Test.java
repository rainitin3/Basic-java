package string;

public class Test
{
	public static void main(String[] args) 
	{
		String s= "Nitin";     //by literal create 1 obj
		
		String s2= "Nitin";
		s.concat(" rai");    // string is immutable
		s=s.concat(" rai");
		
		String s3= "amit" + " rai";
		
		String s1=new String("Nitin");  // by new keyword create 2 obj
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s));   // compare by original content of string
		
		System.out.println(s==s2);          // compare by reference not value
		
		System.out.println(s.compareTo(s1)); // compare length of string
	}

}
