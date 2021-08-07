package jre;

public class Array2D 
{
	
	public static void main(String[] args) 
	{
		
		String s[] = {"NITIN","AMIT","RAHUL","SHASHANK"};
		for(int i=0; i<=s.length-1; i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("++++++++++++++++++++++++");
		
		int[][] a = {{12,12,13},{25,30},{80,50,60}}; //jagged array
		
		for(int i=0; i<=a.length-1;i++)
		{
			for(int j=0; j<=a[i].length-1;j++)
			{
				
			System.out.print(a[i][j]+ " ");
			
			}
			System.out.println();
		}
		System.out.println("========================");
			System.out.println(a[0][1]+a[1][0]);
		
		
	}

}
