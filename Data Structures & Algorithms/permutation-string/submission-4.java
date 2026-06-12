class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (char c : s1.toCharArray()) {
            c1[c-'a']++;
        }
        int l = 0;
        int r = 0;
        while (r < s2.length()) {
            if ((r-l) >= s1.length()) {
                c2[s2.charAt(l)-'a']--;
                l++;
            }
            else {
                c2[s2.charAt(r)-'a']++;
                if (Arrays.equals(c1,c2)) {
                    return true;
                }
                r++;
            }
        }
        return false;
    }
}
