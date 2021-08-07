package looping;

public class A {

	public static void main(String[] args) {
          
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i == 2 && j == 2 || i == 2 && j == 3 || i == 4 && j == 2 || i == 4 && j == 3) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
System.out.println("===============");
//B
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= 1; j--) {
				if(i==2&&j==2||i==2&&j==3||i==4&&j==2||i==4&&j==3)				
				{
				System.out.print("  ");	
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
System.out.println("===============");
//c
	for (int i = 1; i<=4; i++)
	{
		for (int j = 1; j<= 4; j++)
		{
			if(i==1&&j==1||i==2&&j>=2||i==3&&j>=2||i==4&&j==1)	 
			{
				System.out.print(" ");
			}
			else {
			System.out.print("*");
			}
		}System.out.println();
	}
System.out.println("===============");
//D
	for (int i = 1; i<=5; i++ )
	{
		for(int j = 1; j<=5;j++)
		{
			if(i==1&&j==5||i==2 &&j==3||i==2 &&j==4)
			{
				System.out.print(" ");
			}
			else if(i==4&&j==3||i==4&&j==4||i==3&&j==3||i==3&&j==4)
			{
				System.out.print(" ");
			}
			else if(i==5&&j==5)
			{
				System.out.print("");
			}
			else
			{
				System.out.print("*");	
			}
		}System.out.println();
	}
System.out.println("===============");
//E
	for (int i = 1; i<=5; i++)
	{
		for (int j=1; j<=5; j++)
		{
			if(i==2&&j>=3||i==4&&j>=3) 
			{
				System.out.print(" ");
			}
			else
			{
			System.out.print("*");
			}
			}System.out.println();
	}
System.out.println("===============");
//F
	for (int i = 1; i<= 5; i++)
	{
		for (int j= 1; j<= 5; j++)
		{
			if(i==2&&j>=3||i>=4&&j>=3)
			{
				System.out.print(" ");
			}
			else 
			{
				System.out.print("*");
			}
		}System.out.println();
	}
System.out.println("===============");
//G
  for (int i = 1; i<=5; i++)
    { 
	  for (int j = 1; j<=7; j++)
        {
	  if(i==1&j<=2||i==2&&j>=2||i==3&&j==2||i==3&&j==3) 
	  {
		  System.out.print (" ");
	  }
	  else if(i==4&j==2||i==4&&j==3||i==4&&j==4||i==4&&j==5||i==4&&j==6) 
	  {
		  System.out.print (" ");
	  }
	  else if (i==5&&j==1||i==5&&j==7)
	  {
		  System.out.print (" ");  
	  }
		  else { System.out.print("*");
	  }
	  }System.out.println();
	}
 System.out.println("===============");
//H
    for (int i = 1; i<=5;i++)
    {
    	for (int j=1; j<=6;j++)
    	{
    		if(i==1&&j==3||i==1&&j==4)
    		{
    			System.out.print(" ");
    		}
    		else if(i==2&&j==3||i==2&&j==4)
    		{
    		System.out.print(" ");	
    		}
    		else if(i>=4&&j==3||i>=4&&j==4)
    		{
    		System.out.print(" ");	
    		} 
    		else 
    		{ System.out.print("*");
    	    }
  	  }System.out.println();
	}
 System.out.println("===============");
  //I
       for (int i = 1; i<=5;i++)
       {
 	       for (int j=1; j<=6;j++)
 	         {
 		       if(i==2&&j<=2||i==3&&j<=2||i==4&&j<=2) 
 		       {
 		    	   System.out.print(" ");
 		       }
 		       else if (i==2&&j>=5||i==3&&j>=5||i==4&&j>=5)
 		       {
 		    	  System.out.print(" ");
 		       } else 
 	    		{ System.out.print("*");
 	    	    }
 	  	  }System.out.println(); 
 	  }
System.out.println("===============");
// J
      for (int i = 1; i<=5;i++)
       {
          for (int j=1; j<=6;j++)
           { 
        	  if (i==2&&j<=3||i==2&&j>=5||i==3&&j<=3||i==3&&j>=5)
        	  {
        		  System.out.print(" ");
        	  }
        	  else if ( i==4&&j==2|| i==4&&j>=5||i==4&&j==3)
        	  {
        		  System.out.print(" ");
        	  }
        	  else if ( i==5&&j==1|| i==4&&j>=5||i==5&&j>=5)
        	  {
        		  System.out.print(" ");
        	  }
        	  else
        	  {
        		  System.out.print("*");
        	  }
           }System.out.println();
           }
System.out.println("===============");
 // K
for (int i = 1; i<=5;i++)
{
	for (int j = 1; j<=6; j++)
	{
		if (i==1&&j==3||i==1&j==4||i==2&&j==3||i==2&&j==6||i==3&&j>=4)
		{
			 System.out.print(" ");
		}
		else if ( i==4&&j==3|| i==4&&j==6||i==5&&j==3||i==5&&j==4)
  	   {
  		  System.out.print(" ");
  	   }
		else
		{
			System.out.print("*");
		}
	}System.out.println();
}
System.out.println("===============");
// L
for (int i = 1; i<=5;i++)
{
	for (int j = 1; j<=6; j++)
	{
		if(i<=4&&j>2)
		{
			System.out.print(" ");
		}
        else 
		{
			System.out.print("*");
		}
	}System.out.println();
	}
System.out.println("===============");
//M
for (int i = 1; i<=5;i++)
{
	for (int j = 1; j<=9; j++)
	{
		if(i==1&&j==4||i==1&&j==5||i==1&&j==6||i==2&&j==5)
	    {
		System.out.print(" ");
      	}
		else if ( i==3&&j==3||i==3&&j==7)
	  	   {
	  		  System.out.print(" ");
	  	   }
		else if ( i==4&&j==3||i==4&&j==4||i==4&&j==6||i==4&&j==7)
	  	   {
	  		  System.out.print(" ");
	  	   }
		else if (i==5&&j==3||i==5&&j==4||i==5&&j==5||i==5&&j==6||i==5&&j==7)
	  	   {
	  		  System.out.print(" ");
	  	   }
		else 
	    {
		System.out.print("*");
     	}
	}System.out.println();
	}
System.out.println("===============");
//N	
   for (int i = 1; i<=5;i++)
    {
    	for (int j = 1; j<=7; j++)
	    {
            if(i==1&&j==3||i==1&&j==4||i==1&&j==5||i==2&&j==5||i==2&&j==4||i==3&&j==3)
            {
            	System.out.print(" ");
            }
            else if(i==4&&j==3||i==4&&j==4||i==5&&j==3||i==5&&j==4||i==5&&j==5)
            {
            	System.out.print(" ");
            }
        	else 
    	    {
    		System.out.print("*");
         	}
    	}System.out.println();
    	}
System.out.println("===============");
 //O
       for (int i = 1; i<=5;i++)
        {
	        for (int j = 1; j<=7; j++)
             { 
	        	if(i==2&&j==3||i==2&&j==4||i==2&&j==5||i==1&&j==1||i==1&&j==7)
	            {
	        		System.out.print(" ");
	            }
	        	else if(i==3&&j==3||i==3&&j==4||i==3&&j==5)
	            {
	        		System.out.print(" ");
	            }
	        	else if(i==4&&j==3||i==4&&j==4||i==4&&j==5||i==5&&j==1||i==5&&j==7)
	            {
	        		System.out.print(" ");
	            }
	        	else
	        	{
	        		System.out.print("*");
	        	}
             }System.out.println();
        }
System.out.println("===============");
//p
     for (int i = 1; i<=5;i++)
      {
           for (int j = 1; j<=6; j++)
           { 
               if(i==1&&j==6||i==2&&j==3||i==2&&j==4||i==2&&j==5)
               {
	        		System.out.print(" ");
	           }
               else if(i>=4&&j>=3||i==3&&j==6)
	            {
	        		System.out.print(" ");
	            }
               else
	        	{
	        		System.out.print("*");
	        	}
        	}  System.out.println(); 
          }
System.out.println("===============");
//Q
     for (int i = 1; i<=5;i++)
      {
         for (int j = 1; j<=5; j++)
          { 
        	 if(i==1&&j>1&&j<4||i==4&&j>1&&j<5||j==1&&i>1&&i<4||j==4&&i>1&&i<5||i==5&&j==5)
             	 {
        		  System.out.print("*");
            	 }
        	 else
	           	 {
	        	  System.out.print(" ");
	        	 }
          }
       System.out.println();
      }
System.out.println("===============");
//R



}}