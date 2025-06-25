package JavaConstructors;

public class Circle {
    
    double radius;

   
    public Circle() {
        this(1.0); 
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    
    public static void main(String[] args) {
        Circle Circle1 = new Circle();       
        Circle Circle2 = new Circle(5.5);     

        System.out.println("Circle1:");
       Circle1.displayRadius();

        System.out.println("Circle2:");
        Circle2.displayRadius();
    }
}
