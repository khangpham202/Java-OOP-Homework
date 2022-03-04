import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix {

    private static void readMatrix(final Scanner scanner, final int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }
    }

    private static void displayMatrix(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
   
       public static void main(final String... args) throws FileNotFoundException {
        final Scanner scanner = new Scanner(new File("a.txt"));

        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();

        System.out.print(String.format("The matrix is %d x %d \n", n1, n2));

        final int[][] firstMatrix = new int[n1][n2];
        final int[][] secondMatrix = new int[n1][n2];
        final int[][] sum = new int[n1][n2];
        final int[][] multiply = new int[n1][n2];
        
        // Reading data to first matrix
        readMatrix(scanner, firstMatrix);
        // Reading data  first matrix
        readMatrix(scanner, secondMatrix);
        System.out.println("a) Hien thi 2 ma tran len man hinh:");
        System.out.println("First Matrix");
        displayMatrix(firstMatrix);
        System.out.println("Second Matrix");
        displayMatrix(secondMatrix);
        for(int i = 0; i <= n1-1; i++){
            for(int j = 0; j <= n2-1; j++){
                sum[i][j] = firstMatrix[i][j] +  secondMatrix[i][j];
            }
        }
        System.out.println("b) Tong hai ma tran:");
        for(int i = 0; i <= n1-1; i++){
            for(int j = 0; j <= n2-1; j++){
                sum[i][j] = firstMatrix[i][j] +  secondMatrix[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("c) Tich hai ma tran:");
        for (int i = 0; i <= n1-1; i++) {
            for (int j = 0; j <= n2-1; j++) {
                multiply[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    multiply[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                } 
                System.out.print(multiply[i][j] + " "); 
            } 
            System.out.println();
        }
    }
}
/*  File a.txt  
3 3 
1 2 3
4 5 6
7 8 9
9 8 7 
6 5 4
3 2 1
*/