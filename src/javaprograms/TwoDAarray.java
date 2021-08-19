package javaprograms;

public class TwoDAarray
{
	
	
	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3}, {2,4,4}, {4,8,9}};
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<=a.length-1; j++)
			{
				System.out.print(" "+a[i][j]);
			}
		System.out.println();
		}
		
	}
	
	

}
