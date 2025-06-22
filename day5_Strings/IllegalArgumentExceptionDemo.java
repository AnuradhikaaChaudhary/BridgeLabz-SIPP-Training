import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        
        generateIllegalArgumentException();
        
        
        handleIllegalArgumentException();
    }

    
    public static void generateIllegalArgumentException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        
        int startIndex = 5;
        int endIndex = 2; 
        
        
        String substring = inputString.substring(startIndex, endIndex);
        System.out.println("Substring: " + substring);
    }

    
    public static void handleIllegalArgumentException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to handle exception: ");
        String inputString = scanner.nextLine();
        
        try {
            
            int startIndex = 5;
            int endIndex = 2; 
            
            
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
