class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int c : nums) {
            map.putIfAbsent(c,1);
        }
        for (int c : nums) {
            if (!map.containsKey(c-1)) {
                int streak = 1;
                while (map.containsKey(c+streak)) {
                    streak++;
                }
                max=Math.max(max,streak);
            }
        }
        return max;
    }
}
