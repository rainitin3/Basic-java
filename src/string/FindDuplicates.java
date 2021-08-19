package string;

public class FindDuplicates {
	
	static int no_of_counts = 256;
	
	static void forCount(String str , int count[]){
		
		for(int i =0; i<str.length(); i++) {
			
			count[str.charAt(i)]++;
		}
		
	}
	
	static void PrintDups(String str) {
		
		int count[] = new int[no_of_counts];
		
		forCount(str, count);
		
		for(int i=0; i<no_of_counts;i++)
			if(count[i]>1)
				System.out.println((char)(i)+ "   "+count[i]);
	}
	
	public static void main(String[] args) {
		
		String str ="Programming";
		PrintDups(str);
	}
	

}
