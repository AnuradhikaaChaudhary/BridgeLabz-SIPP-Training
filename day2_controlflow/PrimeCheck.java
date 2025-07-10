import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();

        
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
            scanner.close();
            return;
        }

        
        boolean isPrime = true;

        
        for (int i = 2; i <= Math.sqrt(number); i++) {
           
            if (number % i == 0) {
                isPrime = false; 
                break; 
            }
        }

        
        scanner.close();

        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
