class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int c : prices) {
            low = Math.min(c,low);
            max = Math.max(max,c-low);
        }
        return max;
    }
}
