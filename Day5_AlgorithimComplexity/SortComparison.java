package Day5_AlgorithimComplexity;

import java.util.*;

public class SortComparison {

    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int size = 10_000;
        int[] original = new Random().ints(size, 1, 100000).toArray();

        int[] arr1 = Arrays.copyOf(original, size);
        int[] arr2 = Arrays.copyOf(original, size);
        int[] arr3 = Arrays.copyOf(original, size);

        long start = System.currentTimeMillis();
        
        long bubbleTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        Arrays.sort(arr2); 
        long quickTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        Arrays.parallelSort(arr3); 
        long mergeTime = System.currentTimeMillis() - start;

        System.out.println("QuickSort Time: " + quickTime + " ms");
        System.out.println("MergeSort (parallel) Time: " + mergeTime + " ms");
        System.out.println("BubbleSort (skipped) Time: " + bubbleTime + " ms");
    }
}
