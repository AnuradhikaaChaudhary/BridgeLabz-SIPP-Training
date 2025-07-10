import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();
        
        System.out.print("Enter the second string: ");
        String secondString = scanner.next();
        
        
        boolean areEqualUsingCharAt = compareStringsUsingCharAt(firstString, secondString);
        
        
        boolean areEqualUsingEquals = firstString.equals(secondString);
        
       
        System.out.println("Are the two strings equal using charAt()? " + areEqualUsingCharAt);
        System.out.println("Are the two strings equal using equals()? " + areEqualUsingEquals);
        
        scanner.close();
    }

    
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }
}
