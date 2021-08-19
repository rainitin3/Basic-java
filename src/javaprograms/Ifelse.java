package javaprograms;

import java.util.Scanner;

public class Ifelse {
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args)
    {
		
     System.out.println(" Enter student percentage: "); 
		
		float percentage=sc.nextFloat();
    	
		if(percentage<50&&percentage>40)
    	{
			System.out.println("average");
		}
		
		else if(percentage>=50 && percentage<70)
		{
		    System.out.println("exceed average");
		}
	
		else if (percentage >=70)
		{
		    System.out.println("exelent");
		}
			
		}

	}


