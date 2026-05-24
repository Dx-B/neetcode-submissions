class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                System.out.println("ran");
                if (prices[j] < prices[i]) {
                    i=j;
                }
                int total = prices[j]-prices[i];
                if (total > max) {
                    max = total;
                }
            }
        }
        return max;
    }
}
