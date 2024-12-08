import java.util.Scanner;

public class NumberPyramid {

    public static void printNumberPyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        printNumberPyramid(line);
    }
}
