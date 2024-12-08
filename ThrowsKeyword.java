import java.util.Scanner;

public class ThrowsKeyword {

    /*
     * Throws keyword is used to indicate that a function on which it is used can
     * throw Exception
     * It is a good practice to use throws keyword so that another person who is
     * using our code or our package can get to know about any possible error the
     * function can throw
     * THROW V/S THROWS
     * Throw keyword is used to create a custom exception
     * whereas
     * Throws keyword is used for indication of a function that this function can
     * throw Exception
     */

    private static void demo(int a, int b) throws Exception {
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        try {
            demo(a, b);
        } catch (Exception e) {
            System.out.println("Exception Occured!!!!");
        }

    }
}
