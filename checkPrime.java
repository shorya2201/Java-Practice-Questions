import java.util.*;

public class checkPrime {

    public static boolean isPrime(int n) {
        if (n == 2 || n == 1) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number) == true) {
            System.out.println("The entered number is a PRIME number.");
        } else {
            System.out.println("The entered number is not a PRIME number.");
        }
    }
}
