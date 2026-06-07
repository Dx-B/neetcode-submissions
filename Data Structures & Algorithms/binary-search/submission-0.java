class Solution {
    public int search(int[] nums, int target) {
        return bSearch(nums,0,nums.length-1,target);
    }
    private int bSearch(int[] nums, int l, int r, int target) {
        // 1,2,3,4,5,6,7 // T = 6, M = 4
        // 4,5,6,7 // M = 5
        // 5,6,7 // M = 6
        int middle = l+(r-l)/2;
        if (l > r) {
            return -1;
        }
        if (nums[middle] > target) {
            return bSearch(nums,l,middle-1,target);
        }
        else if (nums[middle] < target) {
            return bSearch(nums,middle+1,r,target);
        }
        else {
            return middle;
        }
    }
}
