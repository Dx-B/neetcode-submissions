class Solution {
    public int maxProfit(int[] prices) {

        int low = prices[0];
        int output = 0;

        for (int price : prices) {

            low = Math.min(low, price);

            int profit = price - low;

            output = Math.max(output, profit);
        }

        return output;
    }
}