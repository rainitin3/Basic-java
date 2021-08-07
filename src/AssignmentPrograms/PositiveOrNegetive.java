package AssignmentPrograms;

import java.util.Scanner;

public class PositiveOrNegetive {
	
     public static void main(String[] args) {
    	 
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a no.  =  ");
     float a = sc.nextFloat();
     
     if(a>0) {
    	 System.out.println("no is positive");
     }else if (a<0) {
    	 System.out.println("no is negetive");
     }
     else {
    	 System.out.println("no. is equal to 0");
     }
}

}
