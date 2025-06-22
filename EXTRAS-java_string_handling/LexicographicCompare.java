import java.util.Scanner;

public class LexicographicCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();

        int minLength = Math.min(s1.length(), s2.length());
        boolean equal = true;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                equal = false;
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                else
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                break;
            }
        }

        if (equal) {
            if (s1.length() == s2.length()) System.out.println("Both strings are equal.");
            else if (s1.length() < s2.length()) System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            else System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        }
    }
}
