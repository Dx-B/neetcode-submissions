class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int max = 0;

        for (int n : set) {

            // start of sequence
            if (!set.contains(n - 1)) {

                int current = n;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                max = Math.max(max, streak);
            }
        }

        return max;
    }
}