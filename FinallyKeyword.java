import java.util.Scanner;

public class FinallyKeyword {

    /*
     * Finally keyword is used to execute important code blocks such as Closing the
     * connection,etc.
     * Java finally block is always executed whether an exception is handled or not.
     * Therefore, it contains all the necessary statements that need to be printed
     * regardless of the exception occurs or not.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        try {
            int result = a / b;
        } catch (Exception e) {
            System.out.println("Exception Occured!!!!");
        } finally {
            System.out.println("The try-catch is successfully executed!!!");
        }
    }
}
