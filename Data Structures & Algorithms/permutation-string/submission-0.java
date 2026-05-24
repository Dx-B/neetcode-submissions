class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int r = s1.length()-1;
        if (s2.length() < s1.length()) {
            return false;
        }
        for (int i = 0; i < s2.length()-r; i++) {
            char[] window = s2.substring(i,i+s1.length()).toCharArray();
            Arrays.sort(window);
            char[] ref = s1.toCharArray();
            Arrays.sort(ref);
            if (Arrays.equals(ref,window)) {
                return true;
            }
        }
        return false;
    }
}