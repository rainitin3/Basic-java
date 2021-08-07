package looping;

public class CopyConstructor
{
	int id;
	String name;
	CopyConstructor(int i ,String s)
	{
		id=i;
		name=s;
		
	}
	
	CopyConstructor(CopyConstructor ct)
	{
		id=ct.id;
		name=ct.name;
		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		CopyConstructor ct1= new CopyConstructor(11, "ram");
		CopyConstructor ct2= new CopyConstructor(ct1);
		ct1.display();
		ct2.id=1120;
		ct2.name="rahul";
		ct2.display();
		
	}
	

}
