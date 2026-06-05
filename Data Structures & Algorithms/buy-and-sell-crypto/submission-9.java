class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low = Integer.MAX_VALUE;
        for (int c : prices) {
            if (c < low) {
                low = c;
            }
            max = Math.max(c-low,max);
        }
        return max;
    }
}
