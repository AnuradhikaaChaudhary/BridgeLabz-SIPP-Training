import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        System.out.println("Reversed String: " + reversed);
    }
}
