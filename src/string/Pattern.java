package string;

public class Pattern
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
		
		 // for(int j=1; j<=i;j++)
		
		  for(int j=1; j<=n-i+1;j++) //that is for print reverse order
			
		{
		   System.out.print(" * ");
		}
		System.out.println();
		}
		
	}

}
