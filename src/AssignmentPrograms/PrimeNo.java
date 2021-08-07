package AssignmentPrograms;

import java.util.Scanner;

public class PrimeNo {
	
	 
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter a no.==  ");
	   
	   int n = sc.nextInt();
	   
	   int temp=0;
	   
	   
		   for (int j=2;j<n;j++) {
		   
		   if(n%j==0)
		   {
			   temp=temp+1;
		   }
	   }
		 
	 if(temp==0) {
		  System.out.println("the number is prime");
	  }else {
		  System.out.println("the number is not prime");
	  }
	
	
}

}
