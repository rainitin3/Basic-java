package method;

import java.util.Scanner;

public class Factorial
{
	 static public void main(String[] args)
		{
			Scanner s= new Scanner(System.in);
			System.out.println("enter a no..");
			int n=s.nextInt();
			int f=1;
			for(int i=1; i<=n; i++)
			{
				 f=f*i;
				
			}
			System.out.println("factorial="+f);
				
			
		}

}
