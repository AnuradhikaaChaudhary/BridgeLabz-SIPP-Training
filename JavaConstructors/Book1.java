package JavaConstructors;
 public class Book1 {
    public String ISBN;
    protected String title;
    private String author;

    
    public Book1(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}


class EBook1 extends Book1 {
    public EBook1(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayBookInfo() {
        System.out.println("ISBN  : " + ISBN);   
        System.out.println("Title : " + title);  
        System.out.println("Author: " + getAuthor()); 
    }
}
