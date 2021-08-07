package AssignmentPrograms;

import java.util.Scanner;


public class Power {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a no=====>");
		int a= Sc.nextInt();
		System.out.println("enter a power==>");
		int p=Sc.nextInt();
		
		int result=1;
		
		for(int i=1;i<=p;i++) {
			
			result=a*result;
		}
		System.out.println("power of number = "+result);
		
	}

}
