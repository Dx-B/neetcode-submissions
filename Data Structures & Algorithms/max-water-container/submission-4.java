class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max = Integer.MIN_VALUE;
        while (l < r) {
            int cal = (r-l)*(Math.min(heights[r],heights[l]));
            max = Math.max(cal,max);
            if (heights[r] > heights[l]) {
                l++;
            }
            else {
                r--;
            }
        }
        return max;
    }
}
