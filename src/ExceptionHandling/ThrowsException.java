package ExceptionHandling;

public class ThrowsException
{
	void v1() throws NullPointerException
	{
		String s=null;
		System.out.println(s.length());
	}
	void v2() throws ArrayIndexOutOfBoundsException
	{
		int[] a= new int[4];
		a[6]=10;
		
	}

	public static void main(String[] args)
	{
		ThrowsException th=new ThrowsException();
		try
		{
			th.v2();
		}
		catch(ArrayIndexOutOfBoundsException ea)
		{
			System.out.println(ea.getMessage());
			System.out.println("Array exception block");
		}
		try 
		{
			th.v1();
		
		}
		catch(NullPointerException e) 
		{
			System.out.println(e.getMessage());
			System.out.println("that is throws exception");
			
		}
		
	}
}
