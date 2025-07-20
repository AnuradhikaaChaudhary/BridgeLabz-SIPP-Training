package Day5_AlgorithimComplexity;
import java.util.*;

public class SearchStructureComparison {

    public static void main(String[] args) {
        int size = 1_000_000;
        int target = size - 1;

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;

        
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) hashSet.add(i);

       
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) treeSet.add(i);

        long start = System.nanoTime();
        for (int num : arr) {
            if (num == target) break;
        }
        System.out.println("Array Search Time: " + (System.nanoTime() - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        boolean found1 = hashSet.contains(target);
        System.out.println("HashSet Search Time: " + (System.nanoTime() - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        boolean found2 = treeSet.contains(target);
        System.out.println("TreeSet Search Time: " + (System.nanoTime() - start) / 1_000_000 + " ms");
    }
}
