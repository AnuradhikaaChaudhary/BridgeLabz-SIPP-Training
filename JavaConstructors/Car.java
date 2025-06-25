package JavaConstructors;
public class Car {
    
    String customerName;
    String carModel;
    int rentalDays;

    
    public Car(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    
    public double calculateTotalCost() {
        double ratePerDay;

        
        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 1500;
                break;
            case "suv":
                ratePerDay = 2500;
                break;
            case "hatchback":
                ratePerDay = 1000;
                break;
            default:
                ratePerDay = 1200; 
        }

        return ratePerDay * rentalDays;
    }

   
    public void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : Rs. " + calculateTotalCost());
    }
}
