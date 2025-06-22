import java.util.Scanner;

public class SplitTextComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a complete text: ");
        String inputText = scanner.nextLine();
        
        
        String[] customWords = splitTextIntoWords(inputText);
        
        
        String[] builtInWords = inputText.split(" ");
        
        
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        
        
        System.out.println("Custom split words: ");
        for (String word : customWords) {
            System.out.println(word);
        }
        
        System.out.println("Built-in split words: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        
        System.out.println("Are the two arrays of words equal? " + areEqual);
        
        scanner.close();
    }

    
    public static String[] splitTextIntoWords(String str) {
        
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; 

        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                
                int endIndex = (i == str.length() - 1) ? i + 1 : i; 
                words[wordIndex] = str.substring(startIndex, endIndex).trim();
                wordIndex++;
                startIndex = i + 1; 
            }
        }
        return words; 
    }

    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false; 
            }
        }
        return true;
    }
}
