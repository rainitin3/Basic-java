package jre;

public class ThisMethod {
	void display() 
	{
		System.out.println("compiler automatically use the this keyword");
	}
	void show()
	{
		display();  //this.display();
	}

	public static void main(String[] args)
	{
		ThisMethod tm = new ThisMethod();
		tm.display();  

	}

}
