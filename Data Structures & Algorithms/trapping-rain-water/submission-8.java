class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lMax = height[l]; int rMax = height[r];
        int output = 0;
        if (height == null || height.length == 0) {
            return 0;
        }
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax,height[l]);
                output += lMax - height[l];
            }
            else {
                r--;
                rMax = Math.max(rMax,height[r]);
                output += rMax - height[r];
            }
        }
        return output;
    }
}
