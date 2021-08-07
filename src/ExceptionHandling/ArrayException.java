package ExceptionHandling;

public class ArrayException 
{
	public static void main(String[] args) 
	{
		int[] a=new int[10];
		try
		{
		a[12]=22;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("that is catch block");
		}
		finally 
		{
			System.out.println("finally block ");
		}
		System.out.println("array exception");
		
		
	}

}
