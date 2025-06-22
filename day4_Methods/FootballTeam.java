import java.util.Arrays;
import java.util.Random;

public class FootballTeam {

    
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
           
            heights[i] = random.nextInt(101) + 150; 
        }
        return heights;
    }

    
    public static int sum(int[] arr) {
        int total = 0;
        for (int height : arr) {
            total += height;
        }
        return total;
    }

   
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

  
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    
    public static void displayResults(int[] heights) {
        System.out.println("Heights of players (in cm): " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum(heights));
        System.out.printf("Mean height: %.2f cm%n", mean(heights));
        System.out.println("Shortest height: " + shortest(heights) + " cm");
        System.out.println("Tallest height: " + tallest(heights) + " cm");
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        displayResults(heights);
    }
}
