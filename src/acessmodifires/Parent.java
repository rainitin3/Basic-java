package acessmodifires;

public class Parent {
	public void show()
	{
		System.out.println(" public access modifires");
	}
	 protected long m1(long a)
	 {
		 System.out.println("protected access modifier");
		 return 0;
	 }
	 
	 byte m2()
	 {
		 System.out.println("default access modifire");
		 return 0;
	 }

}
