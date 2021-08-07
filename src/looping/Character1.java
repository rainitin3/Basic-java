package looping;

public class Character1
{
	
	   
	public static void main(String[] args) 
	{
		int n=5;
		char c = 'a';
		char x = 'a';
		
		for(int i=1; i<=n; i++)
		{
		
		if(i%2==0)
		{
		   c='0';
		}
		else 
		{
			c=x++;
		}
		for(int j=1; j<=i;j++)
		
		//for(int j=1; j<=n-i+1;j++) //that is for print reverse order
			
		{
		 System.out.print(c+" ");
		}
		System.out.println();
		}
		
	}


}
