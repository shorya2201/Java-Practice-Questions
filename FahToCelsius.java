import java.util.Scanner;

public class FahToCelsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting Fahrenheit point: ");
        int start = sc.nextInt();

        System.out.println("Enter Ending Fahrenheit point: ");
        int end = sc.nextInt();

        System.out.println("Enter steps: ");
        int steps = sc.nextInt();

        int cel;

        System.out.println("Fahrenheit Celsius");

        while (start <= end) {
            cel = ((5 * (start - 32)) / 9);
            System.out.println(start + "          " + cel);
            start += steps;
        }

    }
}