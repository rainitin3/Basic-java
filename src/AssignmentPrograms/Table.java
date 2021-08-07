package AssignmentPrograms;

import java.util.Scanner;

public class Table {
	 static public void main(String[] args)
		{
			Scanner s= new Scanner(System.in);
			System.out.println("enter a no..");
			int n=s.nextInt();
			for(int i=1; i<=10; i++)
			{
				int t=i*n;
				System.out.println(t);
			}
				
			
		}

}
