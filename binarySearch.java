import java.util.*;

public class binarySearch {

    public static int binarySearching(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
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
        System.out.println("Enter the key you want to Search: ");
        int key = sc.nextInt();

        int value = binarySearching(arr, key);
        if (value == -1) {
            System.out.println("The required key is NOT FOUND in the given array.");
        } else {
            System.out.println("The required key is found at index: " + value);
        }
    }
}
