package ObjectModeling;

import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class LibraryandBooks {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("Community Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); 

        lib1.showBooks();
        lib2.showBooks();
    }
}
