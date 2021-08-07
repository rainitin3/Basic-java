package acessmodifires;

public class Child extends Parent {
	public void show()   //public to default
	{
		System.out.println("acess modifires types");
	}
	public long m1(long a)   //protected to public
	{
		System.out.println("protected");
		return 0;
		
	}
	public byte m2()      //defalt to public
	 {
		 System.out.println("default access modifire types");
		 return 0;
	 }

	public static void main(String[] args)
	{
		
		
	}

}
