import java.util.Scanner;

public class SpiralMatrix {

    public static void printSpiral(int[][] matrix) {

        int startRow = 0;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        int endRow = matrix.length - 1;

        while (startCol <= endCol && startRow <= endRow) {

            for (int j = startRow; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

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

        printSpiral(arr);

    }
}
