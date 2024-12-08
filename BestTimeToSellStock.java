import java.util.*;

public class BestTimeToSellStock {
    // Same technique solved by using auxiliary arrays
    /*
     * Profit = Selling Price{prices[i]} - Buying Price
     * Max Profit = Max(Selling Price{prices[i]} , MaxProfit)
     */

    static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;// so that every value will be smaller on any day
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {// profit is possible
                int profit = prices[i] - buyPrice;// today's profit
                maxProfit = Math.max(profit, maxProfit);// overall profit
            } else {// profit is not possible i.e. We have to reduce the BuYPrice
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Days : ");
        int days = sc.nextInt();
        int prices[] = new int[days];
        System.out.println("Enter Prices : ");
        for (int i = 0; i < days; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println("The Maximum Profit will be: " + result);
    }
}
