package polymorphism;

public class ByConstructor {
	ByConstructor()
	{
		System.out.println("no argument constructor");
	}
    
	ByConstructor(String a) 
	{
		
		System.out.println("1 arg constructor " + a);
		
	}
	
	public static void main(String[] args) {
		ByConstructor B1 = new ByConstructor();
		ByConstructor c1 = new ByConstructor( "available");
		

	}

}
