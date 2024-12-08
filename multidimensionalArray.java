import java.util.*;

public class multidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D Array = 1D Array(For reference) + 1D Array(For data)
        // arrays are stored in heap memory

        int arr[][] = new int[2][3];

        // assigning values in int [i][j] format one by one

        System.out.println("Please Enter the values");
        // assigning values by user input
        // cant use enhanced for loop for storing values as it takes array elements as a
        // copy...Therefore we should use traditional for loop to store values in an
        // array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Now we have successfully stored the values in our 2D array

        // Retrieving values from array

        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
