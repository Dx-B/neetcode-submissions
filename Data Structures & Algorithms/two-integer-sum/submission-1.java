class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement;
            complement = target - nums[i];
            if (map.containsKey(complement) == false) {
                map.put(nums[i], i);
            }
            else {
                if (map.get(complement) > i) {
                    output = new int[]{i, map.get(complement)};
                }
                else {
                    output = new int[]{map.get(complement),i};
                }
            }
        }
        return output;
    }
}
