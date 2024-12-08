import java.util.*;

public class TermsOfAP {

    public static void main(String[] args) {

        {

            ArrayList<Integer> ans = new ArrayList<Integer>();
            int x = 5;
            int got = 0;
            int[] res = new int[x];
            int current = 5;

            while (got != x) {
                current = (3 * got) + 2;
                if (current % 4 != 0) {
                    ans.add(got, current);
                    current += 3;

                }
                got++;
            }

            for (int i = 0; i < x; i++) {
                for (int result : ans) {
                    if (result % 4 != 0) {
                        res[i] = result;
                    }
                }
            }
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            // return res;

        }
    }
}
