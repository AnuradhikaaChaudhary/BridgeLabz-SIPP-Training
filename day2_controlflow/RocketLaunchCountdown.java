import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt();

        
        System.out.println(" Rocket launch countdown begins!");
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

    
        System.out.println("Liftoff! ");

        input.close();
    }
}
