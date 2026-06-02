class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int l = i+1;
            int r = nums.length-1;
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i-1] == nums[i]) {
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
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    output.add(temp);
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return new ArrayList<>(output);
    }
}
