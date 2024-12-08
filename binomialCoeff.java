import java.util.*;

public class binomialCoeff {

    public static int nFact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static int rFact(int r) {
        int f = 1;
        for (int index = 1; index <= r; index++) {
            f = f * index;
        }
        return f;
    }

    public static int diffFact(int n, int r) {
        int diff = n - r;
        int f = 1;
        for (int i = 1; i <= diff; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of r: ");
        int r = sc.nextInt();

        System.out.println("The Binomial Coefficient of given number is: " + (nFact(n) / (rFact(r) * diffFact(n, r))));
    }
}
