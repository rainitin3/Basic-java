package polymorphism;

//method overloading

public class MethodOverloading {

	void show() {
		System.out.println("1");
	}
	
	void show(int a) {
		System.out.println("22");
		
	}
	public static void main(String[] args) {
		MethodOverloading a1 = new MethodOverloading();
		a1.show(11);
	}
}
