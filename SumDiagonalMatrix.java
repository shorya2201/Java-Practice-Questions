import java.util.Scanner;

public class SumDiagonalMatrix {

    public static int printSum(int matrix[][]) {
        int sum = 0;

        // Brute Force Approach O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // }

        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // Optimized Approach O(n)
        for (int i = 0; i < matrix.length; i++) {
            // For Primary Diagonal
            sum += matrix[i][i];
            // For Secondary Diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows for matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter Cols for matrix: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter elements for matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // diagonalSum(arr);
        int result = printSum(arr);

        System.out.println("The sum of given matrix is: " + result);
    }

    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    sum1 += arr[i][j];
                }
            }
        }

        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                }
            }
        }
        sum = sum1 + sum2;
        return sum;
    }

}
