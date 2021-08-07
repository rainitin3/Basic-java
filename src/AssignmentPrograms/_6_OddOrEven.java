package AssignmentPrograms;

import java.util.Scanner;

public class _6_OddOrEven {
	
	public static void main(String[] args) {
		
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter a no.===  ");
	  int a= s.nextInt();
	  
	  if (a%2==0) {
		  System.out.println("Even Number");
	  }
	  else{
		  System.out.println("Odd Number");
	  }
		
	}

}
