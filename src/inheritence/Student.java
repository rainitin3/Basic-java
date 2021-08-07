package inheritence;

public class Student extends School
{
	protected int s1() 
	{
		System.out.println("that is student class");
		return 0;
	}
	static void m1() 
	{
		System.err.println("thst is static method");
	}
	public static void main(String[] args)
	{
		Student s2= new Student();
		School s3= new School();
		s3.s1();
		s2.s1();
		m1();
		
	}

}
