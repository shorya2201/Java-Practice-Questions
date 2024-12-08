import java.util.Scanner;

public class ThrowKeyword {

    private static void test(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Allowed for Voting....Age is less than 18");
        } else {
            System.out.println("Allowed for voting....");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        test(a);
    }
}
