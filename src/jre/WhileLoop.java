package jre;

import java.util.Scanner;

public class WhileLoop {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		int sum=0;
		
		while(temp>0) {
			
			int lastDigit= temp%10;
			temp/= 10;
			sum+= lastDigit;
		}
		System.out.println("sum of all digit  "+n + " is " +  sum);
		

	}

}
