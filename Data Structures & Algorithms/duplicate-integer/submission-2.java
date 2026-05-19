class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> table = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(nums[i])==false) {
                table.put(nums[i],1);
            }
            else {
                return true;
            }
        }
        return false;
    }
}