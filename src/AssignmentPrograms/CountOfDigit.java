package AssignmentPrograms;

import java.util.Scanner;

public class CountOfDigit {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no = ");
		int n= sc.nextInt();
		int t1=n;
		int length=0;
		
		while(t1 !=0){
			
			length = length+1;
			t1=t1/10;
		}
		System.out.println(length);
		
		
	}
}
