class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        int length = 0;
        Set<Character> set = new HashSet<>();
        if (s.length() <= 1) {
            return s.length();
        }
        while (l < s.length()) {
            while (r < s.length() && !set.contains(s.charAt(r))) {
                length++;
                set.add(s.charAt(r));
                r++;
                System.out.println(s.substring(l,r) + " " + (r-l));
            }
            max = Math.max(max,length);
            set.remove(s.charAt(l));
            l++;
            length--;
            System.out.println(s.substring(l,r) + " " + (r-l));
        }
        return max;
    }
}
