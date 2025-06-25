package JavaConstructors;
public class BorrowBook {
    // Attributes
    String title;
    String author;
    double price;
    boolean isAvailable;

    public BorrowBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = true;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    
    public void displayDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : Rs. " + price);
        System.out.println("Available   : " + (isAvailable ? "Yes" : "No"));
    }

   
    public static void main(String[] args) {
    	BorrowBook book1 = new BorrowBook("1984", "George Orwell", 299.0, true);

        System.out.println("Book Details:");
        book1.displayDetails();

        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        System.out.println("\nAfter borrowing:");
        book1.displayDetails();

        System.out.println("\nTrying to borrow again...");
        book1.borrowBook();
    }
}
