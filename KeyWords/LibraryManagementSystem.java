package KeyWords;
class Book {
    
    static String libraryName = "Central City Library";

   
    private String title;
    private String author;
    private final String isbn; 

    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book b2 = new Book("1984", "George Orwell", "9780451524935");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        
        Book.displayLibraryName();
        System.out.println();

        
        if (b1 instanceof Book) {
            b1.displayBookDetails();
        }

        if (b2 instanceof Book) {
            b2.displayBookDetails();
        }

        if (b3 instanceof Book) {
            b3.displayBookDetails();
        }
    }
}
