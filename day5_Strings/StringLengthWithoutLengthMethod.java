import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        
       
        int customLength = findLengthWithoutLengthMethod(inputString);
        
        
        int builtInLength = inputString.length();
        
        
        System.out.println("Length of the string using custom method: " + customLength);
        System.out.println("Length of the string using built-in method: " + builtInLength);
        
        scanner.close();
    }

    

    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count; 
    }
}
