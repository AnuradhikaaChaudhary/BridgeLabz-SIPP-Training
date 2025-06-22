import java.util.Scanner;

public class LowercaseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a complete text: ");
        String inputText = scanner.nextLine();
        
        
        String customLowercase = convertToLowercase(inputText);
        
       
        String builtInLowercase = inputText.toLowerCase();
        
        
        boolean areEqual = compareStrings(customLowercase, builtInLowercase);
        
        
        System.out.println("Custom lowercase conversion: " + customLowercase);
        System.out.println("Built-in lowercase conversion: " + builtInLowercase);
        System.out.println("Are the two lowercase strings equal? " + areEqual);
        
        scanner.close();
    }

    
    public static String convertToLowercase(String str) {
        StringBuilder lowercaseString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                
            }
            lowercaseString.append(ch);
        }
        return lowercaseString.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}
