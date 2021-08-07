package jre;

public class ThisConstructor {
	

	public ThisConstructor()
	{
	
		
		System.out.println(" no arg constructor");
	}
	 public ThisConstructor(int a)
	 {
		 this();
		System.out.println("arg constructor"); 
	 }

	public static void main(String[] args)
	{
		ThisConstructor tc= new ThisConstructor(10);
		
		

	}


}
