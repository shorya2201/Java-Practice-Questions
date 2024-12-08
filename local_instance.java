import java.util.*;

public class local_instance {

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static int add(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }

    public static double add(double n1, double n2) {
        double result = n1 + n2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();
        double res1 = add(num1, num2);
        System.out.println(res1);
    }
}