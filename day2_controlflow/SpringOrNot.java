
public class SpringOrNot {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two integer arguments: month (1-12) and day (1-31).");
            return;
        }

        int month = 0;
        int day = 0;

        try {
            month = Integer.parseInt(args[0]);
            day = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Month and day must be integers.");
            return;
        }
        
        boolean isSpringSeason = false;

        if (month == 3) {
            if (day >= 20 && day <= 31) {
                isSpringSeason = true;
            }
        } else if (month == 4 || month == 5) {
            if (day >= 1 && day <= 31) {
                isSpringSeason = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 20) {
                isSpringSeason = true;
            }
        }

        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
