class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        return Arrays.equals(a,b);
    }
}
