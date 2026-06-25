class Solution {
    public int findMin(int[] nums) {
        // 3,4,5,6,1,2, C=2
        // 5,6,1,2 C=1
        int l = 0;
        int r = nums.length-1;
        while (l < r) {
            int center = (l+r)/2;
            if (nums[center] > nums[r]) {
                l = center+1;
            }
            else {
                r = center;
            }
        }
        return nums[l];
    }
}
