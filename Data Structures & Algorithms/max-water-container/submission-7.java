class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxVolume = 0;
        while (l < r) {
            int area = (r-l)*(Math.min(heights[r],heights[l]));
            if (heights[r] > heights[l]) {
                l++;
            }
            else {
                r--;
            }
            maxVolume = Math.max(maxVolume,area);
        }
        return maxVolume;
    }
}
