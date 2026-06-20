class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i-1]==nums[i]) {
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while (l < r) {
                int sum = nums[l]+nums[r]+nums[i];
                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {
                    output.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[l],nums[r])));
                    while (l < r && nums[r-1]==nums[r]) r--;
                    while (l < r && nums[l+1]==nums[l]) l++;
                    r--;
                    l++;
                }
            }
        }
        return new ArrayList<>(output);
    }
}
