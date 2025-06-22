import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        String result = "";

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else
                result += ch;
        }

        System.out.println("Toggled String: " + result);
    }
}
