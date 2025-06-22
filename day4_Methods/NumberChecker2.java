
import java.util.Arrays;

public class NumberChecker2 {

 
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    
    private static int[] digitsArray(int number) {
        String str = Integer.toString(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    
    public static boolean isSpy(int number) {
        int[] digits = digitsArray(number);
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String strNum = Integer.toString(number);
        String strSquare = Integer.toString(square);
        return strSquare.endsWith(strNum);
    }

  
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    
    public static void main(String[] args) {
        int[] testNumbers = {7, 9, 153, 25, 1729, 5, 49};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println(" - Prime? " + isPrime(num));
            System.out.println(" - Neon? " + isNeon(num));
            System.out.println(" - Spy? " + isSpy(num));
            System.out.println(" - Automorphic? " + isAutomorphic(num));
            System.out.println(" - Buzz? " + isBuzz(num));
            System.out.println();
        }
    }
}
