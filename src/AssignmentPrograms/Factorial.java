package AssignmentPrograms;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no. = ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			f=f*i;
			
			
		}
		System.out.println("factorial of a number is = "+f);	
	}

}
