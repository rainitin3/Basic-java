package AssignmentPrograms;

public class _1_EscapeChar {

	public static void main(String[] args) {
		
		String str = "i am \t learning java";      //\t for tab
		System.out.println(str);
		
		String str1 = "i am learning java \b";     //\b used for printing backspace
		System.out.println(str1);
		
		String str2 = "i am \n learning java";      // \n is insert for enter a new line
		System.out.println(str2);
		
		String str3 = "i am \\ learning java"; 
		System.out.println(str3);
		                            
	}
}
