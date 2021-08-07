package polymorphism;

class Employee
{ 
	private int employee_id;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

}
public class Encapsulation
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setEmployee_id(101);
		System.out.println(e1.getEmployee_id());
	
		
	}
}
