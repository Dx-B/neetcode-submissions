class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> path = new HashMap<>();

        for (int a : nums) {
            path.putIfAbsent(a, 1);
        } 
        int longest = 0;
        for (int c : nums) {
            if (path.containsKey(c-1)) {

            }
            else {
                int length = 1;
                while (path.containsKey(c+length)) {
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
