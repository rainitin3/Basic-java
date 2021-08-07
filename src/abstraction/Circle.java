package abstraction;

import java.util.Scanner;

public abstract class Circle
{
	abstract void area();
	void m1() 
	{
		System.out.println("this is abstract class");
		
	}
	public static void main(String[] args) 
	
	{
		areaOfCircle a= new areaOfCircle();
		a.area();
		
	}
}

class areaOfCircle extends  Circle
 {
	void area()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter a radiaus= ");
		float r = s.nextFloat();
		float areaOfCircle;
		
		areaOfCircle=r*r*22/7;
		System.out.println("area of circle: " +areaOfCircle);
		
		
	}
	 
 }
