import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = switch (op) {
            case '+' -> add(a, b);
            case '-' -> subtract(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            default -> Double.NaN;
        };

        if (!Double.isNaN(result))
            System.out.println("Result: " + result);
        else
            System.out.println("Invalid operation.");
    }

    static double add(double x, double y) { return x + y; }
    static double subtract(double x, double y) { return x - y; }
    static double multiply(double x, double y) { return x * y; }
    static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return x / y;
    }
}
