class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int c : nums) {
            if (set.contains(c)) {
                return true;
            }
            else {
                set.add(c);
            }
        }
        return false;
    }
}