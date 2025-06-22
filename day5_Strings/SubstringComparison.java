import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();
        
       
        String charAtSubstring = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        
        
        String builtInSubstring = inputString.substring(startIndex, endIndex);
        
       
        boolean areEqual = compareStrings(charAtSubstring, builtInSubstring);
        
        
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are the two substrings equal? " + areEqual);
        
        scanner.close();
    }

    
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
