package Day3_SortingAlgorithm;
public class SelectionSortExample {

    
    public static void selectionSort(int[] scores) {
        int n = scores.length;

       
        for (int i = 0; i < n - 1; i++) {
           
            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            
            if (minIndex != i) {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }

    
    public static void printArray(int[] arr) {
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] examScores = {85, 70, 95, 60, 75, 90};

        System.out.println("Original exam scores:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("Sorted exam scores (ascending):");
        printArray(examScores);
    }
}
