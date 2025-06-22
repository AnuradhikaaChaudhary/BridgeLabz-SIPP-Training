import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        int students = 5; 
        int[][] scores = generateRandomScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }

    public static int[][] generateRandomScores(int n) {
        int[][] data = new int[n][3]; 
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(41) + 60; 
            data[i][1] = rand.nextInt(41) + 60; 
            data[i][2] = rand.nextInt(41) + 60; 
        }
        return data;
    }

    
    public static double[][] calculateStats(int[][] scores) {
        double[][] result = new double[scores.length][3]; 

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];

        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];

            if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else if (percent >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

   
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\t\t%age\tGrade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    (int) stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
}
