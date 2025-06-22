import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        System.out.print("Enter number of terms: ");
        int terms = new Scanner(System.in).nextInt();
        printFibonacci(terms);
    }

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
