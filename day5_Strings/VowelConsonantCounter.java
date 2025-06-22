import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = new Scanner(System.in).nextLine();

        int[] count = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + count[0]);
        System.out.println("Consonants: " + count[1]);
    }

    
    public static String checkCharType(char ch) {
        
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharType(ch);

            if (result.equals("Vowel")) vowels++;
            else if (result.equals("Consonant")) consonants++;
        }

        return new int[]{vowels, consonants};
    }
}
