package ObjectModeling;
import java.util.ArrayList;

class Product {
    String name;
    double pricePerUnit;
    double quantity;

    Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

class Customer {
    String name;
    ArrayList<Product> cart;

    Customer(String name) {
        this.name = name;
        cart = new ArrayList<>();
    }

    void addProduct(Product p) {
        cart.add(p);
    }

    void showCart() {
        System.out.println("Customer: " + name);
        for (Product p : cart) {
            System.out.println("- " + p.name + ": " + p.quantity + " units @ $" + p.pricePerUnit + "/unit");
        }
    }
}

class BillGenerator {
    double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.cart) {
            total += p.getTotalPrice();
        }
        return total;
    }
}

public class GroceryStoreBillApp {
    public static void main(String[] args) {
        
        Customer alice = new Customer("Anu");
        Product apples = new Product("Apples", 3.0, 2.0); 
        Product milk = new Product("Milk", 2.0, 1.0);     

        alice.addProduct(apples);
        alice.addProduct(milk);

        alice.showCart();

        
        BillGenerator billGen = new BillGenerator();
        double total = billGen.generateBill(alice);
        System.out.println("Total Bill for " + alice.name + ": $" + total);
    }
}
