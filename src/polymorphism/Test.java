package polymorphism;


 class Xyz
 {
	
	 void show() 
	 {
		System.out.println("hell0000000o");
	 }
	

}
 class Test extends Xyz 
 {
		 void show()
		{
			System.out.println("hieee");
			
		}
		public static void main(String[] args) 
		{
			 Xyz a1=new Xyz();
			    a1.show();
			Test t = new Test();
		    t.show();
		    
		   
		}    
		
     
		
 }
