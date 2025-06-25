package JavaConstructors;

 class Book {

    String title;
    String author;
    double price;

   
     Book() {
        this.title = "The Namesake";
        this.author = "Jhumpa Lahiri";
        this.price = 400.0;
    }

    
     Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

  
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : Rs. " + price);
    }

    
    public static void main(String[] args) {
       
        Book Book1 = new Book();
        System.out.println("Book1:");
        Book1.displayDetails();

        System.out.println();

        
        Book Book2 = new Book("The God of Small Things", "Arundhati Roy", 500);
        System.out.println("Book2:");
        Book2.displayDetails();
    }
}
