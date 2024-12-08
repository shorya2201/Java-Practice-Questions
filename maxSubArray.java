import java.util.*;

public class maxSubArray {

    public static void printMaxSubArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.println("The Current Sum of SubArray is: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The Maximum SubArray is: " + maxSum);
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
        printMaxSubArray(arr);
    }
}
