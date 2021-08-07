package looping;

public class Chracter3 
{
	public static void main(String[] args) 
	{
		
		String s="NITIN";
		int n=s.length();
		
		
		for(int i=1; i<=n; i++)
		{
		  for(int j=1; j<=i;j++)
		
		//for(int j=1; j<=n-i+1;j++) //that is for print reverse order
			
		{
		 System.out.print(s.charAt(j-1)+" ");
		}
		  
		System.out.println();
		}
		
	}

}
