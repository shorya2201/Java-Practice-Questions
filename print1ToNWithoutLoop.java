// Time Complexity: O( n )
// Space Complexity: O( n )
/**
 * print1ToNWithoutLoop
 */
public class print1ToNWithoutLoop {

    public static int[] printNos(int x) {
        // Declaring empty integer array
        int[] ans = new int[x];

        // Calling recursive function
        recursiveFunction(x, ans);

        return ans;
    }

    public static void recursiveFunction(int x, int[] ans) {
        // base condition
        if (x == 0) {
            return;
        }

        // Call recursive function
        recursiveFunction(x - 1, ans);

        // Insert element in the array
        ans[x - 1] = x;
    }

    public static void main(String[] args) {

        int arr2[] = new int[20];
        arr2 = printNos(20);// storing array we got from function call

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
