import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        String result = "";

        for (char c : input.toCharArray())
            if (result.indexOf(c) == -1)
                result += c;

        System.out.println("Modified String: " + result);
    }
}
