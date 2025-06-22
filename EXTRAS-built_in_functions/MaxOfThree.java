import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");
        int max = findMax(a, b, c);
        System.out.println("Maximum: " + max);
    }

    static int getInput(String msg) {
        System.out.print(msg);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}
