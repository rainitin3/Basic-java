package javaprograms;

public class ThisDemo
{
	void m1(ThisDemo td)
	{
		System.out.println("method call by this" );
		
	}
  void m2()
  {
	 m1(this);
  }
	
  
  public static void main(String[] args)
	{
	  ThisDemo td= new ThisDemo();
	  td.m2();
		
		
	}

}
