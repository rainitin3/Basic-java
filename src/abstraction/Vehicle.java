package abstraction;


abstract class vehicle {
	
	abstract void start();

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		Scooter s = new Scooter();
		s.start();
	
	}
	}

class Car extends vehicle
{
	void start() 
	{
		System.out.println("car start with key");
	}
	
}

class Scooter extends vehicle
{
     void start()
     {
    	 System.out.println("schooker start with kick");
	 
     }
}
