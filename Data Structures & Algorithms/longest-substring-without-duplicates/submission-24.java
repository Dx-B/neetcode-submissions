class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] a = s.toCharArray();
        int l = 0;
        int r = 0;
        int max = 0;
        while (l < s.length() && r < s.length()) {
            if (set.contains(a[r])) {
                set.remove(a[l]);
                l++;
            }
            else {
                set.add(a[r]);
                r++;
            }
            max = Math.max(max,r-l);
        }
        return max;
    }
}
