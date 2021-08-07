package method;

public class Test 
{
	 int a,b,c;
	int sum;
	public Test(int a, int b, int c)
	{
		a=10;
		b=20;
		c=26;
		sum = a+b+c;
		System.out.println(sum +" my name is khan");
		
	}
	void v1() 
	{
		System.out.println(a/2);
	}
	public static void main(String[] args) 
	{
		Test t1= new Test(11, 22, 33);
		t1.a=300;
		t1.v1();
		
		
		
	}
	
	

}
