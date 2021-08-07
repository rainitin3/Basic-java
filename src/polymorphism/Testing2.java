package polymorphism;

public class Testing2
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
		Testing2 t= new Testing2();
		t.m(1,2);
		
		
	}

}
