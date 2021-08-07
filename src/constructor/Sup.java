package constructor;

public class Sup 
{
	 Sup()
	{
		System.out.println("no arg constructor");
	}
	public static void main(String[] args)
	{
		Sup s= new Sup();
		Dog d1 = new Dog();
		d1.m1();
		
		
	}
	}

	class animal{
		String color= "green";
	}
	class Dog extends animal{
		String color= "black";
	
	void m1()
	{
		System.out.println(color);
		System.out.println(super.color);
			
		}
		
	}


