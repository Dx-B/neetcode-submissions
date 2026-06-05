class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for (int c : prices) {
            low = Math.min(low,c);
            profit = Math.max(c-low,profit);
        }
        return profit;
    }
}
