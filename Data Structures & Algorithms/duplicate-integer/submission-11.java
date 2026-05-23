class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int c : nums) {
            if (map.containsKey(c)) {
                return true;
            }
            else {
                map.put(c,1);
            }
        }
        return false;
    }
}