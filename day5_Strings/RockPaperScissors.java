import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, computerWins = 0, draws = 0;

        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][3];

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();

            String result = findWinner(user, computer);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;
            else draws++;

            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = result;
        }

        String[][] stats = getStats(userWins, computerWins, games);
        displayResults(results, stats);
    }

    
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

   
    public static String[][] getStats(int user, int comp, int total) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(user);
        stats[0][2] = String.valueOf((user * 100) / total) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(comp);
        stats[1][2] = String.valueOf((comp * 100) / total) + "%";

        return stats;
    }

    
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWin%");
        System.out.println("----------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
}
