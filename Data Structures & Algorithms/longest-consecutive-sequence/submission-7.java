class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int c : nums) {
            set.add(c);
        }
        int max = 0;
        for (int c : set) {
            if (!set.contains(c-1)) {
                int streak = 1;
                while (set.contains(c+streak)) {
                    streak++;
                }
                max = Math.max(max,streak);
            }
        }
        return max;
    }
}
