package ObjectModeling;
import java.util.ArrayList;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void showProducts() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println(p.name);
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    Order placeOrder() {
        return new Order();
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Customer cust = new Customer("Alice");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        Order order = cust.placeOrder();
        order.addProduct(p1);
        order.addProduct(p2);

        System.out.println("Customer: " + cust.name);
        order.showProducts();
    }
}
