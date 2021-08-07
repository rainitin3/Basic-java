package AssignmentPrograms;

public class _9_DuplicateChar {
	public static void main(String[] args) {
		
	
		String str1 = "BANANA";
	
	int leng = str1.length();
	
	char[] a = str1.toCharArray();
	
	for(int i=0; i<leng;i++) {
		
		for (int j=i+1;j<leng;j++) {
			if(a[i]==a[j]) {
			System.out.println("duplicate elements are == "+a[j]);
			break;
			}
		}
	}


}
}
