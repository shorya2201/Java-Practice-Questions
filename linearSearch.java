import java.util.*;

public class linearSearch {

    public static int linearSearching(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
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
        System.out.println("Enter the key you want to find: ");
        int key = sc.nextInt();

        int index = linearSearching(arr, key);
        if (index == -1) {
            System.out.println("The required key is NOT FOUND!!");
        } else {
            System.out.println("The key is found at index: " + index);
        }
    }
}
