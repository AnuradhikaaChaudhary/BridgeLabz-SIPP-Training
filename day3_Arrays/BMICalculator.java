import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        
        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        
        for (int i = 0; i < number; i++) {
            double weight, height;
            
            
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight < 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (weight < 0);
            
            
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height < 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (height < 0);
            
            
            double bmi = weight / (height * height);
            personData[i][0] = weight; 
            personData[i][1] = height; 
            personData[i][2] = bmi;     
            
            
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        scanner.close();
    }
}
