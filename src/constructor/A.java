package constructor;

public class A extends Test
{
	void v2()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.m1();
		A a1 = new A();
		a1.v2();
		a1.m2();
		t1.m2();
		
		

	}

}
