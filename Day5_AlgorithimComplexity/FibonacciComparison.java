package Day5_AlgorithimComplexity;
public class FibonacciComparison {

    
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

  
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.currentTimeMillis();
        int rec = fibonacciRecursive(n);
        long time1 = System.currentTimeMillis() - start;
        System.out.println("Recursive Fibonacci(" + n + ") = " + rec + ", Time: " + time1 + " ms");

        start = System.currentTimeMillis();
        int iter = fibonacciIterative(n);
        long time2 = System.currentTimeMillis() - start;
        System.out.println("Iterative Fibonacci(" + n + ") = " + iter + ", Time: " + time2 + " ms");
    }
}
