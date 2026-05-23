class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int p1 = i + 1;
            int p2 = nums.length - 1;

            int target = -nums[i];

            while (p1 < p2) {

                int sum = nums[p1] + nums[p2];

                if (sum == target) {

                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));

                    p1++;
                    p2--;

                    // skip duplicates
                    while (p1 < p2 && nums[p1] == nums[p1 - 1]) {
                        p1++;
                    }

                    while (p1 < p2 && nums[p2] == nums[p2 + 1]) {
                        p2--;
                    }

                }
                else if (sum < target) {
                    p1++;
                }
                else {
                    p2--;
                }
            }
        }

        return result;
    }
}