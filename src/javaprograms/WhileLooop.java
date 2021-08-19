package javaprograms;

import java.util.Scanner;

public class WhileLooop {
	

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp= n;
		int number=0;
		while(temp>0) {
			int lastdigit=temp%10;
			number=number * 10 + lastdigit;
			temp/=10;
			
			
		}
		if(number==n) {
        System.out.println("the number "+n + " is pelindrom");
		}
		else {
			System.out.println("the number "+ n+ " not p");
			
		}
		
	}

}
