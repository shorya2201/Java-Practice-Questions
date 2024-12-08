import java.util.*;

public class decToBinary {

    public static void decConvert(int dec) {
        int mynum = dec;
        int pow = 0;
        int binNum = 0;
        while (dec > 0) {
            int rem = dec % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("The Binary of " + mynum + " is " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int decimal = sc.nextInt();
        decConvert(decimal);
    }
}
