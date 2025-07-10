import java.util.Scanner;

public class NumberAnalysis {

    
    public static boolean isPositive(int num) {
        return num >= 0;
    }

   
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    
    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

       
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        
        int result = compare(numbers[0], numbers[4]);
        System.out.print("First and last elements comparison: ");
        if (result == 0)
            System.out.println("Equal");
        else if (result > 0)
            System.out.println("First is Greater");
        else
            System.out.println("First is Less");

        sc.close();
    }
}
