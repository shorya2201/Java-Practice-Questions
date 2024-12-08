import java.util.*;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines: ");
        int lines = sc.nextInt();
        System.out.println("======================================");
        // outer loop
        for (int i = 1; i <= lines; i++) {
            // for spaces
            for (int j = 1; j < (lines - (i - 1)); j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= lines; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}