class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // -4,-1,-1,0,1,2
        // -4,
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            int l = i+1;
            int r = nums.length-1;
            if (i > 0 && nums[i-1]==nums[i]) {
                continue;
            }
            while (l < r) {
                int sum = nums[i]+nums[l]+nums[r];
                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {
                    output.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    while (l<r && nums[l]==nums[l+1]) l++;
                    while (l<r && nums[r]==nums[r-1]) r--;
                    r--;
                    l++;
                }
            }
        }
        return new ArrayList<>(output);
    }
}
