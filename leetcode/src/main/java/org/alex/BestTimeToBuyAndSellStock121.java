public class BestTimeToBuyAndSellStock121 {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (profit < prices[i] - buy) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 2, 5, 3, 6, 1};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }
}

