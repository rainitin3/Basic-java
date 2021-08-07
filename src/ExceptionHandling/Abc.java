package ExceptionHandling;

 class ExceptionNumber {

	public static void main(String[] args)
	{
		try
		{
	        String s = null;
	        s.equals(s);
	        System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	        
	       
	}
}
