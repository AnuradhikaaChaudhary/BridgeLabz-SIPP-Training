import java.util.Arrays;

public class NumberChecker1 {

    
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        number = Math.abs(number); 
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    
    public static int[] digitsArray(int number) {
        int length = countDigits(number);
        int[] digits = new int[length];
        number = Math.abs(number);
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

   
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    
    public static boolean isPalindrome(int number) {
        int[] digits = digitsArray(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    
    public static boolean isDuckNumber(int number) {
        int[] digits = digitsArray(number);
        
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        int number = 10501;

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = digitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        boolean arraysEqual = compareArrays(digits, reversedDigits);
        System.out.println("Are digits array and reversed array equal? " + arraysEqual);

        boolean palindrome = isPalindrome(number);
        System.out.println("Is the number palindrome? " + palindrome);

        boolean duckNumber = isDuckNumber(number);
        System.out.println("Is the number a duck number? " + duckNumber);
    }
}
