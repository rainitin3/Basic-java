package AssignmentPrograms;

public class _7_ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Programming";
		
		int size = str.length();
		
		String rev = "";
		
		for(int i = size-1; i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
		
		
	
	
	}	

}
	