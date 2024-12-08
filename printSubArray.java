import java.util.*;

public class printSubArray {

    public static void printSubArray(int arr[]) {
        int totalSubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    totalSubArray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total no. of subarrays is: " + totalSubArray);
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
        System.out.println("The SubArrays are: ");
        printSubArray(arr);

    }
}
