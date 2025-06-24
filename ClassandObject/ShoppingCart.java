package ClassandObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class CartItem {
   
    String itemName;
    double price;
    int quantity;

   
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    double getTotalPrice() {
        return price * quantity;
    }

    
    void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}

public class ShoppingCart {
    static ArrayList<CartItem> cart = new ArrayList<>();

   
    static void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println("Item added to cart.");
    }

    
    static void removeItem(String itemName) {
        Iterator<CartItem> it = cart.iterator();
        boolean found = false;
        while (it.hasNext()) {
            CartItem item = it.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                it.remove();
                found = true;
                System.out.println("Item removed from cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart.");
        }
    }

    
    static void displayCart() {
        double total = 0;
        System.out.println("Shopping Cart");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter Item Name to Remove: ");
                    String removeName = sc.nextLine();
                    removeItem(removeName);
                    break;
                case 3:
                    displayCart();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);
    }
}
