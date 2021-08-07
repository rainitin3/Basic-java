package inheritence;

public class Child extends Perent {
	
	
	String name1= "hello";

	void m2() {
		System.out.println("this is child class");
	}
	public static void main(String[] args) {
	/*	Child c1= new Child();
		c1.m2();
		c1.m1();
		System.out.println(c1.name1);
		System.out.println(c1.name);  */
		
		
	/*	Perent p1= new Perent();
		p1.m1();*/
		 
		

	}

	static {  //child SIB
		System.out.println("Child sib");
	
	}
}
