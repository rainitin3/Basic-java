package abstraction;

public abstract class Bike
{
	abstract void run();
	Bike()
	{
		System.out.println("bike is created");
	}
	public static void main(String[] args) 
	{
	 Run b1= new Run();
	 b1.run();
     }
	
	

}
	
	class Run extends Bike
	{
		void run()
		{
			System.out.println("running slowly");
		}
	
	
	}


