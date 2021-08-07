package AssignmentPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no = ");
		int a= sc.nextInt();
		int rem;
		int rev=0;
		
		while(a!=0) {
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;	
		}
		System.out.println("reverse of a number is = "+rev);
	}

	

}
