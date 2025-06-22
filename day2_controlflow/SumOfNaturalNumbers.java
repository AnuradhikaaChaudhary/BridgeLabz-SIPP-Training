import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a natural number (positive integer): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive natural number.");
        } else {
            
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            
            int sumFormula = n * (n + 1) / 2;

            
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumWhile == sumFormula) {
                System.out.println(" Both computations are correct!");
            } else {
                System.out.println("The results do not match.");
            }
        }

        input.close();
    }
}
