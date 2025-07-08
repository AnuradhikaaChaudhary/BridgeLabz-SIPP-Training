package JavaConstructors;

public class Hotel {
	String guestName;
	String roomType;
	int nights;
	
	public Hotel(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights= nights;
	}
	
	public Hotel() {
		this.guestName = "Anu";
		this.roomType = "Single";
		this.nights = 2;
	}
	
	public Hotel(Hotel other) {
		this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
		
	}
	
	public void display() {
		 System.out.println("Guest Name : " + guestName);
	     System.out.println("Room Type  : " + roomType);
	     System.out.println("Nights     : " + nights);
	}
	

	public static void main(String[] args) {
		Hotel booking1 = new Hotel(); 
        Hotel booking2 = new Hotel("Nikki", "Deluxe", 3); 
        Hotel booking3 = new Hotel(booking2); 

        System.out.println("Booking 1 :");
        booking1.display();

        System.out.println("\nBooking 2 :");
        booking2.display();

        System.out.println("\nBooking 3 :");
        booking3.display();
		// TODO Auto-generated method stub

	}

}
