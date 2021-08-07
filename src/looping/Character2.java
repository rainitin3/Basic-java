package looping;

public class Character2 
{
	public static void main(String[] args) 
	{
		int n=5;
		char c = 'A';
		
		
		for(int i=1; i<=n; i++)
		{
		
		if(i%2==0)
		{
		   c=Character.toLowerCase(c);
		}
		else 
		{
			c=Character.toUpperCase(c);
		}
		for(int j=1; j<=i;j++)
		
		//for(int j=1; j<=n-i+1;j++) //that is for print reverse order
			
		{
		 System.out.print(c+" ");
		 
		}
		c++;
		System.out.println();
		}
		
	}

}
