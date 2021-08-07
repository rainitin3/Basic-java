package method;

import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a no:");
		int n=s.nextInt();
		if(n%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap");
		}
	}

}
