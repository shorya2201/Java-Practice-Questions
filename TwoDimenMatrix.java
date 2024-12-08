import java.util.*;

public class TwoDimenMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        int n = matrix.length; // No. of rows
        int m = matrix[0].length; // No. of columns
        // for storing values
        System.out.println("Enter values for Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // for Printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchInMatrix(matrix, 5);
        largestSmallestInMatrix(matrix);
    }

    // Searching in the matrix
    static boolean searchInMatrix(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found!!!");
        return false;
    }

    // Largest and Smallest in the matrix
    static void largestSmallestInMatrix(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, matrix[i][j]);
                min = Math.min(min, matrix[i][j]);
            }
        }
        System.out.println("Largest Element in the Matrix is : " + max);
        System.out.println("Smallest Element in the matrix is : " + min);
    }
}
