package AssignmentPrograms;

import java.util.Scanner;

import method.FactRecursion;

public class FactRec {
	 static int f=1;
     
     public static void main(String[] args)
     {
  	   Scanner s= new Scanner(System.in);
  	   
  	   System.out.println("enter a no.=");
  	   int no=s.nextInt();
  	   
  	   
  	  
  	   FactRec fr= new FactRec();
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
