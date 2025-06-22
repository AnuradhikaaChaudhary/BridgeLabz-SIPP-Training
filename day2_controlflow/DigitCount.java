import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        number = Math.abs(number);

        
        int count = 0;

        
        while (number != 0) {
            
            number /= 10; 

            
            count++;
        }

        
        System.out.println("The number of digits is: " + count);

      
        scanner.close();
    }
}
 