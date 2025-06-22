import java.util.Scanner;

public class Multiples{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            
            int counter = number;

            
            while (counter < 100) {
                System.out.println(counter);
                counter += number; 
            }
        }

        input.close();
    }
}
