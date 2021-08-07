package polymorphism;

public class Testing
{
	 void m(int a)
	{
		System.out.println("static method");
	}
	 void m(int a, int v) 
	{
		System.out.println("overloading");
	}
	public static void main(String[] args)
	{
		Testing t= new Testing();
		t.m(1,2);
		
		
	}

}
