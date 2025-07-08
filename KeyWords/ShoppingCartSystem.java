package KeyWords;
class Product {
    
    static double discount = 10.0; 

    
    private static int productCounter = 0;

    
    private String productName;
    private double price;
    private int quantity;
    private final int productID; 

    
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

        
        productCounter++;
        this.productID = productCounter;
    }

    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

   
    public double getTotalPrice() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }

    
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price per unit: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price after discount: Rs. " + getTotalPrice());
        System.out.println("-------------------------------");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 50000.0, 1);
        Product p2 = new Product("Mobile Phone", 20000.0, 2);

        
        Product.updateDiscount(15.0); 

        
        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }
    }
}
