import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }

        int sumUsingLoop = 0;
        int sumUsingFormula = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            sumUsingLoop += i;
        }

        System.out.println("Sum using for loop: " + sumUsingLoop);
        System.out.println("Sum using formula: " + sumUsingFormula);

        if (sumUsingLoop == sumUsingFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy between the two computations.");
        }

        scanner.close();
    }
}
