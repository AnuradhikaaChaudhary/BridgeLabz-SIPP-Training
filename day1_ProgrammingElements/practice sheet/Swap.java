import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Swapping
        double temp = number1;
        number1 = number2;
        number2 = temp;
        
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
