import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Character to remove: ");
        char toRemove = sc.nextLine().charAt(0);

        String result = "";
        for (char ch : input.toCharArray())
            if (ch != toRemove)
                result += ch;

        System.out.println("Modified String: " + result);
    }
}
