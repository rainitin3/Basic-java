package method;

import java.util.Scanner;

public class FactRecursion 
{
       static int f=1;
       
       public static void main(String[] args)
       {
    	   Scanner s= new Scanner(System.in);
    	   int res;
    	   System.out.println("enter a no.=");
    	   int no=s.nextInt();
    	   
    	   
    	  
    	   FactRecursion fr= new FactRecursion();
    	   fr.calfact(no);
    	   System.out.println("factorial of  "  + no+" is "   +   f);
       }
    	   
    	   void calfact(int no)
    	   {
    		   if(no>=1)
    		   {
    			   f=f*no;
    			   calfact(no-1);
    		   
    		   }
    	   }

    	   
	

}
