//BY PREFIX ARRAY IMPLEMENTATION
//in this we calc. subarray sum for each index and store
//it in different array then call values from new array accordingly.{O(N^2)}

import java.util.*;

public class maxSubArrayKadane {

    public static void printMaxSubArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // creating a prefix array
        int prefix[] = new int[arr.length];
        // as array start from 0 so values will be same
        prefix[0] = arr[0];
        // entering values
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                System.out.println("The Current SubArray Sum is: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The Maximum SubArray is: " + maxSum);
    }

    // BY USING KADANES ALGORITHM
    // in this if at any point CS is -ve, the overall value of CS will be 0.{O(n)}
    public static void kadanesAlgo(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The Maximum SubArray by Kadanes algorithm is: " + ms);
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
        kadanesAlgo(arr);
    }
}
