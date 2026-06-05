class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int c : nums) {
            set.add(c);
        }
        int max = 0;
        for (int c : set) {
            int length = 1;
            if (!set.contains(c-1)) {
                while (set.contains(c+length)) {
                    length++;
                }
            }
            max = Math.max(max,length);
        }
        return max;
    }
}
