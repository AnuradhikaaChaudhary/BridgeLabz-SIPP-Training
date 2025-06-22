import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        String[] words = new Scanner(System.in).nextLine().split(" ");
        String longest = "";

        for (String word : words)
            if (word.length() > longest.length())
                longest = word;

        System.out.println("Longest word: " + longest);
    }
}
