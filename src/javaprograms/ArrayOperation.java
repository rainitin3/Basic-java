package javaprograms;

public class ArrayOperation {
	
		
		private  int add(int[] a) {
			
			int sum=0;
			for (int i=0;i<=a.length-1;i++) {
				sum=sum+a[i];
				
			}
			return sum;
		}

		public static void main(String[] args) {

			// Array stores same datatype data

			/*
			 * int arr1[]; int[] arr2; int[] arr3;
			 * 
			 * int[] arr4 = new int[10];// it stores int data element byte[] arr5 = new
			 * byte[5];//it stores byte data elemnt float[] arr6 = new float[6];//it stores
			 * float data elemnt
			 */
	ArrayOperation ao= new ArrayOperation();
			
			float b[]= {30.4f,20.5f,3.0f,45.2f,7.8f};
			String[] s= {"Nitin","Suresh","Anil","Pravin","Sidhant"};
			
			int a[] = new int[10];
			a[0] = 5;
			a[1] = 4;
			a[2] = 3;
			a[3] = 6;
			a[4] = 7;
			a[5] = 8;
			a[6] = 9;
			a[7] = 1;
			a[8] = 2;
			a[9] = 10;
			
			
			
			System.out.println("----Int array-----");
			System.out.println("length of the array :"+a.length);
			for (int i = 0; i <= a.length-1; i++) {
				System.out.println(a[i]);
			}
			
		
			System.out.println("Sum of a[]:"+ao.add(a));
			
			System.out.println("----float array-----");

			for (int i=0;i<=b.length-1;i++) {
				System.out.println(b[i]);
			}
			
			System.out.println("----String array-----");
			for (int i=0;i<=s.length-1;i++) {
				System.out.println(s[i]);
			}

			

		}

		

	}


