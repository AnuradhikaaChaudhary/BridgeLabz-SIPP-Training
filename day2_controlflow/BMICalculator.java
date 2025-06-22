import java.util.Scanner; 

public class BMICalculator{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter weight in kilograms:");
        double weight = input.nextDouble();

        System.out.print("Enter height in centimeters:");
        double heightCm = input.nextDouble();

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;
          if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }  if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }
    }
}
    

