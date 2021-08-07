package AssignmentPrograms;

public class _8_SpecialCharRemove {

	public static void main(String[] args) {
		
		String str= " J%AV*#&#*A  pr%#$gra%@ming";
	
		str=str.replaceAll("[^a-zA-Z0-9]", "");
	    
	    System.out.println(str);
		
		
		}
}
