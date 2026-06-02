class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            int l = i+1;
            int r = nums.length-1;
            if (i > 0 && nums[i-1]==nums[i]) {
                continue;
            }
            while (l < r) {
                int sum = nums[l]+nums[r]+nums[i];
                if (sum > 0) {
                    r--;
                }
                else if (sum < 0) {
                    l++;
                }
                else {
                    output.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[r],nums[l])));
                    while (l < r && nums[r-1]==nums[r]) {
                        r--;
                    }
                    while (l < r && nums[l+1]==nums[l]) {
                        l++;
                    }
                    r--;
                    l++;
                }
            }
        }
        return new ArrayList<>(output);
    }
}
