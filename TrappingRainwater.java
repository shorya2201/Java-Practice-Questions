import java.util.*;

public class TrappingRainwater {

    /*
     * This can be solved by auxilary arrays O(n) & with DP O(1)
     * 1. Trapped Rainwater = (Water level - Height[i])*width
     * 2. Water Level = Min(Left max , Right max)
     * 3. Both LEFT MAX & RIGHT MAX will be calculated and stored in 2 auxiliary
     * arrays
     * prior calling the function
     */

    static int trappedRainwater(int[] height) {
        int n = height.length;

        // CALCULATING LEFTMAX & RIGHTMAX auxiliary ARRAYS

        int leftMax[] = new int[n];
        leftMax[0] = height[0];// coz first block does not have left boundary
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);// comparing current block with previous leftMax Boundary
        }

        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // CALCULATING Trapped Rainwater

        int trappedRainwater = 0;

        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainwater += waterlevel - height[i];
        }

        return trappedRainwater;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of blocks: ");
        int size = sc.nextInt();
        int height[] = new int[size];
        System.out.println("Enter Heights : ");
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }

        int result = trappedRainwater(height);

        System.out.println("The Trapped Rainwater is :" + result);

    }
}
