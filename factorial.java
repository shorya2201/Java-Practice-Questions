import java.util.*;

public class factorial {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number: ");
        // int num = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= num; i++) {
        // fact = fact * i;
        // }
        int x = 5;
        System.out.println("The factorial of given number is : " + fact(x));
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
