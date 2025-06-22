import java.util.Scanner;

public class ManualTrimmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedCustom = manualSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        System.out.println("Trimmed String (Custom): '" + trimmedCustom + "'");
        System.out.println("Trimmed String (Built-in): '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + isEqual);
    }

    
    static int[] findTrimIndices(String str) {
        int start = 0, end = 0;
        int len = getLength(str);

     
        while (start < len && str.charAt(start) == ' ') start++;

        
        end = len - 1;
        while (end >= 0 && str.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    
    static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (getLength(s1) != getLength(s2)) return false;

        for (int i = 0; i < getLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    
    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
}
