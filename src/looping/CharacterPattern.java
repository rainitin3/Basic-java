package looping;

public class CharacterPattern
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++) 
				
		   //for(int j=1; j<=n-i+1;j++)	 ///that is used for reverse pattern
				
			{
				System.out.print((char)('A'+(j-1))+" ");
			}
			System.out.println();
		}
		
		
	}

}
