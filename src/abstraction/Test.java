package abstraction;

public interface Test 
{
	public static final int t=10;
	 void start();
	 
	  
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.start();
		
	}


}
 class A implements Test
{
	public void start() 
	{
		System.out.println("hello");
		
	}
	

}
