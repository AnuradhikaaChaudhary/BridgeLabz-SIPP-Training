package KeyWords;
class Vehicle {
    
    static double registrationFee = 5000.00;

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; 

    // Constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("-----------------------------");
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle("Annu", "Car", "REG12345");
        Vehicle v2 = new Vehicle("Nikki", "Bike", "REG67890");

        
        Vehicle.updateRegistrationFee(5500.00);

        
        if (v1 instanceof Vehicle) {
            v1.displayRegistrationDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayRegistrationDetails();
        }
    }
}
