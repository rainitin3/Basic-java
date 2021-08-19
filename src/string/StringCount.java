package string;

public class StringCount {
	
	final static int no_of_count = 256;
	
	static void ForCount(String str , int count[]) {
		
		for(int i=0; i<str.length(); i++) {
			
			count[str.charAt(i)]++;
		}
		
	}

	
	static void printDups(String str) {
		
		int count[] = new int[no_of_count];
		
		ForCount(str, count);
		
		for(int i=0; i<no_of_count;i++)
			
			if(count [i] >1)
				
				System.out.println((char)(i) +" count " +count[i]);
		}

	
	public static void main(String[] args) {
		String str ="bananaab";
		printDups(str);
		
	}
}
