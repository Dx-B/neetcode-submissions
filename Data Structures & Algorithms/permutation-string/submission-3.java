class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = new char[26];
        char[] c2 = new char[26];
        int l = 0;
        for (int i = 0; i < s1.length(); i++) {
            c1[s1.charAt(i)-'a']++;
        }
        for (int r = 0; r < s2.length(); r++) {
            c2[s2.charAt(r)-'a']++;
            if ((r-l) == s1.length()) {
                c2[s2.charAt(l)-'a']--;
                l++;
            }
            if (Arrays.equals(c1,c2)) {
                return true;
            }
        }
        return false;
    }
}
