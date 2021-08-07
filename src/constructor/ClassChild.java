package constructor;

public class ClassChild extends Class1 {
	
	public ClassChild(int a, int b, int c) {
		super.a=a;
		super.b=b;
		super.c=c;
		
	}
	public static void main(String[] args) {
		ClassChild  c = new ClassChild(20,30,10);
		c.m1();
	}

}
