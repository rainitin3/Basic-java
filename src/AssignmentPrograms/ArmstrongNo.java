package AssignmentPrograms;

import java.util.Scanner;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no = ");
		int n= sc.nextInt();
		int t1=n;
		int length=0;
		
		while(t1 !=0){
			
			length = length+1;
			t1=t1/10;
		}
		
		int t2=n; int rem;
		 int arms=0;
		while(t2!=0) {
			int multiply=1;
			rem=t2%10;
			for(int i=1;i<=length;i++) {
				multiply=multiply*rem;
			}
			arms=arms+multiply;
			t2=t2/10;
		}
		if(arms==n) {
			System.out.println("it is an armstrong number");
		}else {
			System.out.println("its not an armstrong number");
		}
	}

}
