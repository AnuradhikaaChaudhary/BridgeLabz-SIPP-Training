import java.util.Scanner;

public class FactorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        int sumSquares = sumOfSquares(factors);

        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);
    }

   
    public static int[] findFactors(int number) {
        int count = 0;

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    
    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    
    public static int productOfFactors(int[] arr) {
        int product = 1;
        for (int value : arr) {
            product *= value;
        }
        return product;
    }

   
    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += (int) Math.pow(value, 2);
        }
        return sum;
    }
}
