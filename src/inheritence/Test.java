package inheritence;

public class Test {
	
	final int a;  //blank final variable
	
	Test()
	{
		 a=10;
	}
	
	final void m1() //final method
	{
		System.out.println("we cant acess the final class by the object ");
	}
	public static void main(String[] args) {
	Test t= new Test();
	t.m1();

	}



final class java          // final class
   {        
	 
	String s;
	long j;
	
	public  void m2() 
	{
		System.out.println("that is final keyward");
	}
}
}