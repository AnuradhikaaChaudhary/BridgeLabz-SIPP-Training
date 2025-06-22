import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number (greater than 0).");
            return;
        }

        int recursiveSum = recursiveSum(n);
        int formulaSum = formulaSum(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula (n(n+1)/2): " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results do not match. Please check your logic.");
        }
    }

    
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

   
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
}
