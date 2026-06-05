class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxL = height[l];
        int maxR = height[r];
        int water = 0;
        while (l < r) {
            if (maxL < maxR) {
                water+=maxL-height[l];
                l++;
                maxL=Math.max(maxL,height[l]);
            }
            else {
                water+=maxR-height[r];
                r--;
                maxR=Math.max(maxR,height[r]);
            }
        }
        return water;
    }
}
