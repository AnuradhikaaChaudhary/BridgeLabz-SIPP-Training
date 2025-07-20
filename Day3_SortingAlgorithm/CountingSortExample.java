package Day3_SortingAlgorithm;
public class CountingSortExample {

    
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int n = ages.length;

        
        int[] count = new int[range];

        for (int i = 0; i < n; i++) {
            count[ages[i] - minAge]++;
        }

        
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        
        int[] output = new int[n];

       
        for (int i = n - 1; i >= 0; i--) {
            int age = ages[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }

    
    public static void printArray(int[] arr) {
        for (int age : arr) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 14, 13, 18, 11, 13, 16, 17, 10};

        System.out.println("Original student ages:");
        printArray(studentAges);

        countingSort(studentAges);

        System.out.println("Sorted student ages (ascending):");
        printArray(studentAges);
    }
}
