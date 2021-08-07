package ExceptionHandling;

public class NumberFormatException
{
      public static void main(String[] args) 
 {
    	  System.out.println("hello java");
    	  try 
    	  {
    	  Integer a = new Integer("str");
    	  System.out.println("hiee");
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println(e.getMessage());
    		  
    	  }
    	  finally 
    	  {
    		  System.out.println("finally block executed");
    	  }
    	  
    	  
    	  
	
}
}
