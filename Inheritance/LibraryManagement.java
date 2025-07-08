package Inheritance;

class Book {
 protected String title;
 protected int publicationYear;

 // Constructor
 Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book info
 void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}


class Author extends Book {
 private String authorName;
 private String bio;


 Author(String title, int publicationYear, String authorName, String bio) {
     super(title, publicationYear); 
     this.authorName = authorName;
     this.bio = bio;
 }

 
 @Override
 void displayInfo() {
     super.displayInfo(); 
     System.out.println("Author Name: " + authorName);
     System.out.println("Bio: " + bio);
 }
}


public class LibraryManagement {
 public static void main(String[] args) {
     Author myBook = new Author(
         "Effective Java",
         2018,
         "Joshua Bloch",
         "Joshua is a software engineer and a well-known Java expert."
     );

     myBook.displayInfo();
 }
}
