import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 'F') {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
