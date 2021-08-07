package AssignmentPrograms;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a first no===>");
	    int a= sc.nextInt();
	    System.out.println("enter a second no.===>");
	    int b= sc.nextInt();
	   
	    char ope= sc.next().charAt(0);
	   
	    float res=0f;
	    
	    switch (ope) {
		case '+':
		      res = a+b;
		      System.out.println(res);
			  break;
			
		case '-':
			 res=a-b;
			 System.out.println(res);
			 break;
	    
		case '*':
			 res=a*b;
			 System.out.println(res);
			 break;
			 
		case '/':
			 res=a/b;
			 System.out.println(res);
			 break;

		default:
			System.out.println("it is invailed");
			break;
		}
		
	}

}
