class Solution {
    public int search(int[] nums, int target) {
        // 3,4,5,6,1,2 || T = 1
        // 

        int l = 0;
        int r = nums.length-1;
        while (l < r) {
            int middle = (l+r)/2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > nums[r]) { // in left sorted half
                if (target > nums[middle] || target < nums[l]) {
                    l = middle + 1; // target must be in right half
                } else {
                    r = middle;
                }
            }
            else {
                if (target < nums[middle] || target > nums[r]) {
                    r = middle;
                }
                else {
                    l = middle+1;
                }
            }
        }
        return nums[l]==target ? l : -1;
    }
}
