package ExceptionHandling;

public class ExceptionHandling 
{

	public static void main(String[] args)
	{
		try {
		int a=20/0;    //Arithmeticexception
		
		System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());
			
		}
		finally 
		{
			System.out.println("finally block is executed");
			
		}
		System.out.println("hello java");
	
	}

}
