package javaprograms;

public class UseOfThis
{
	
	int i;
	
	void m1(int i) 
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		UseOfThis u1=new UseOfThis();
		u1.m1(100);
		u1.show();

	}

}
