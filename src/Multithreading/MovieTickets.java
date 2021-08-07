package Multithreading;


 class BookMySeat
{
	 int total_seats = 10;
	 int seats;
	 
	 void bookseats(int seats) 
	 {
         if(total_seats>=seats)
		 {
        	 System.out.println("seats book successfully");
        	 total_seats=total_seats-seats;
        	 System.out.println("seats available :" +total_seats);
        	 
		 }
         else 
         {
        	 System.out.println("seats are not booked ");
        	 System.out.println("seats avalavale  " +total_seats);
         }
	 }
	 
}

public class MovieTickets extends BookMySeat
{
	   static BookMySeat b;
	   //int seats;
	   public void run()
	   {
		   b.bookseats(seats);
	   }
	public static void main(String[] args) 
	{
	  b = new BookMySeat();
	 MovieTickets nitin = new MovieTickets();
	 nitin.seats=6;
	 nitin.run();
	 
	 MovieTickets amit = new MovieTickets();
	 amit.seats=7;
	 amit.run();
	}

}
