package method;

import java.util.Scanner;

public class FindGreater
{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter a;");
		int a= s.nextInt();
		
		System.out.println("enter b;");
		
		int b=s.nextInt();
		
		if(a<b) {
			System.out.println("this is grater");
		}
		else
		{
			System.out.println("samll");
		}
		
	}

}
