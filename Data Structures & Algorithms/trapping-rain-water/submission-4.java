class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxL = height[l];
        int maxR = height[r];
        int output = 0;
        if (height == null || height.length == 0) {
            return 0;
        }
        while (l < r) {
            if (maxL < maxR) {
                l++;
                maxL = Math.max(height[l],maxL);
                output+=maxL-height[l];
            }
            else {
                r--;
                maxR = Math.max(maxR, height[r]);
                output+=maxR - height[r];
            }
        }
        return output;
    }
}
