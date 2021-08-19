package javaprograms;

public class Employee 
{
	 int employee_id;
	 String empl_name;
	 static String empl_company="rcbcsk";
	
	 public Employee(int employee_id, String empl_name )
	 {
		 this.employee_id= employee_id;
		 this.empl_name=empl_name;
		 
		
	 }
	 void display() 
	 {
		 System.out.println(employee_id+" "+empl_name+" "+empl_company);
	 }
	 
	 public static void main(String[] args)
	 {
		 Employee e1=new Employee(101, "nitin");
		 Employee e2=new Employee(100, "amit");
		 e1.display();
		 e2.display();
		 
		
	}

}
