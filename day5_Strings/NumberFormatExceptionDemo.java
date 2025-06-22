import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
       
        generateNumberFormatException();
        
        
        handleNumberFormatException();
    }

    
    public static void generateNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (as text): ");
        String input = scanner.nextLine();
        
        
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }


    public static void handleNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (as text) to handle exception: ");
        String input = scanner.nextLine();
        
        try {
            
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}
