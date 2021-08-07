package collection;

public class Employee 

{
	int eid;
	String eName;
	Employee(int eid , String eName)
	{
		this.eid=eid;
		this.eName=eName;
		
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(111, "Rahul");
		Employee e2=new Employee(222, "nitin");
		Employee e3= new Employee(333, "Anil");
		
		Employee[] e=new Employee[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		
		for(Employee ee:e)
		{
			System.out.println(ee.eid+ "   "+ee.eName);
		}
		
		
		
		
	}
	

	
}
