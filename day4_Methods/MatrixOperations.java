import java.util.Random;

public class MatrixOperations {

   
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);  
        return matrix;
    }

  
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

   
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    
    public static void printMatrix(String name, int[][] matrix) {
        System.out.println(name + ":");
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        int rows = 2, cols = 3;

        
        int[][] A = generateRandomMatrix(rows, cols);
        int[][] B = generateRandomMatrix(rows, cols);

        
        int[][] B2 = generateRandomMatrix(cols, rows);  

       
        printMatrix("Matrix A", A);
        printMatrix("Matrix B", B);
        printMatrix("Matrix B2", B2);

      
        int[][] sum = addMatrices(A, B);
        int[][] diff = subtractMatrices(A, B);
        int[][] prod = multiplyMatrices(A, B2);

       
        printMatrix("A + B", sum);
        printMatrix("A - B", diff);
        printMatrix("A * B2", prod);
    }
}
