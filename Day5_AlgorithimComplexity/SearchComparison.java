package Day5_AlgorithimComplexity;
import java.util.Arrays;

public class SearchComparison {

    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = new int[1_000_000];
        for (int i = 0; i < data.length; i++) data[i] = i;

        int target = 999_999;

        long start = System.nanoTime();
        int index1 = linearSearch(data, target);
        long time1 = System.nanoTime() - start;
        System.out.println("Linear Search: Index = " + index1 + ", Time = " + time1 / 1_000_000 + " ms");

        Arrays.sort(data); 
        start = System.nanoTime();
        int index2 = binarySearch(data, target);
        long time2 = System.nanoTime() - start;
        System.out.println("Binary Search: Index = " + index2 + ", Time = " + time2 / 1_000_000 + " ms");
    }
}
