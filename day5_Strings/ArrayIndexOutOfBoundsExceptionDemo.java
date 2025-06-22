import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        
        generateArrayIndexOutOfBoundsException();
        
        
        handleArrayIndexOutOfBoundsException();
    }

    
    public static void generateArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to access the names array: ");
        int index = scanner.nextInt();
        
        
        System.out.println("Name at index " + index + ": " + names[index]);
    }

   
    public static void handleArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to access the names array to handle exception: ");
        int index = scanner.nextInt();
        
        try {
            
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index " + index + " is out of bounds.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
