import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = new Scanner(System.in).nextLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
