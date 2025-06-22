import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 in meters: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete needs to complete %.2f rounds to cover 5 km.%n", rounds);
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distanceToRun = 5000.0; 
        return distanceToRun / perimeter;
    }
}
