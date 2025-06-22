import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = new Scanner(System.in).nextLine().toLowerCase();

        int[] freq = new int[256];
        for (char ch : input.toCharArray())
            freq[ch]++;

        int max = 0;
        char mostFrequent = ' ';

        for (char ch : input.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
