import java.util.Scanner;

public class UppercaseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a complete text: ");
        String inputText = scanner.nextLine();
        
       
        String customUppercase = convertToUppercase(inputText);
        
        
        String builtInUppercase = inputText.toUpperCase();
        
       
        boolean areEqual = compareStringsUsingCharAt(customUppercase, builtInUppercase);
        
        
        System.out.println("Custom uppercase conversion: " + customUppercase);
        System.out.println("Built-in uppercase conversion: " + builtInUppercase);
        System.out.println("Are the two uppercase strings equal? " + areEqual);
        
        scanner.close();
    }

    
    public static String convertToUppercase(String str) {
        StringBuilder uppercaseString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                
                ch = (char) (ch - 32);
            }
            uppercaseString.append(ch);
        }
        return uppercaseString.toString();
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
