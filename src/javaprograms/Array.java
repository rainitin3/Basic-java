package javaprograms;

public class Array {
      
	private static int add(int a[]) {
    	  int sum=0;
    	   for(int i=0; i<a.length-1;i++) {
    		   sum=sum+a[i];
    	   }
    	   return sum;
       }
	public static void main(String[] args) {
		int a[] = new int[10];
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		a[5]=30;
		a[6]=35;
		a[7]=40;
		a[8]=45;
		a[9]=50;
		
		for(int i=0; i<a.length;i++)
		System.out.println(a[i]);
		System.out.println("sum of array=" +add(a));
		

	}

}
