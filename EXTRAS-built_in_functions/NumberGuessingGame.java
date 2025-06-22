import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (enter: high / low / correct)");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it.");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * ((high - low) + 1));
    }
}
