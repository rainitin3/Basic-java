package looping;

import java.util.Scanner;

public class Starpattern3 {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	   
	    System.out.println("enter no. of stars");
	    int n= sc.nextInt();
	   
	    for(int i=1; i<=4; i++)
	    {
	    	for(int j=1; j<=i; j++)
	    	{
	    		System.out.print(" * ");
	    	}
	    	System.out.println();
	    }
	    for(int i=1; i<=4; i++)
	    {
	    	for(int j=3; j>=i; j--)
	    	{
	    		System.out.print(" * ");
	    	}
	    	System.out.println();
	    }
	    
	  
	}

}
