import java.util.*;

public class largestInArray {

    public static int largestElement(int arr[]) {
        int largest = Integer.MIN_VALUE; // FOR using -infinity(can use MAX_VALUE for +infinity)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
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
        int element = largestElement(arr);
        System.out.println("The largest Element in the given array is: " + element);

    }
}
