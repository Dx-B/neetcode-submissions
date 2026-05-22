class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 48, 24, 6, 1 -> 48, 24, 12, 8
        // -1,0,1,2,3 -> 0,6,6,3,1 -> 0,-6,0,0,0
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                ans[i] *= nums[j];
            }
        }
        for (int i = nums.length-1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                ans[i] *= nums[j];
            }
        }

        return ans;
    }
}  
