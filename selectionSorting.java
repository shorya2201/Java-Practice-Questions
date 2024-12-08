import java.util.*;

public class selectionSorting {

    // SORTING THE ARRAY

    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;// assuming it as sorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {// if value at current index is smaller than the smallest variable
                    smallest = j;
                }

            }
            // swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // PRINTING THE ARRAY

    public static void printArr(int arr[]) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements for Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        printArr(arr);
    }
}
