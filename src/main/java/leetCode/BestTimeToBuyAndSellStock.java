package leetCode;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                int profit = price - min;
                if (profit > max) {
                    max = profit;
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7};
        maxProfit(array);
    }
}