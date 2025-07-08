package JavaConstructors;
public class Vehicle {
    
    String ownerName;
    String vehicleType;

    
    static double registrationFee = 5000.0; 

   
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    
    public void displayVehicleDetails() {
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

   
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: Rs. " + registrationFee);
    }

    
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aman Sharma", "Car");
        Vehicle v2 = new Vehicle("Neha Singh", "Motorcycle");

        System.out.println(" Vehicle 1 Details ");
        v1.displayVehicleDetails();

        System.out.println("\n Vehicle 2 Details ");
        v2.displayVehicleDetails();

        System.out.println("\n Updating Registration Fee ");
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\n Vehicle 1 Details (After Fee Update) ");
        v1.displayVehicleDetails();
    }
}
