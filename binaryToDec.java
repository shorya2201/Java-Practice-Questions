import java.util.*;

public class binaryToDec {

    public static void binToDec(int bin) {
        int mynum = bin;
        int dec = 0;
        int pow = 0;
        while (bin > 0) {
            int lastdigit = bin % 10;
            dec = dec + (lastdigit * (int) (Math.pow(2, pow)));
            pow++;
            bin = bin / 10;
        }
        System.out.println("Decimal of " + mynum + " is :" + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number: ");
        int binary = sc.nextInt();
        binToDec(binary);
    }
}
