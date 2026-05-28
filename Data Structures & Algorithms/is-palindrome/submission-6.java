class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int r = s.length()-1;
        int l = 0;
        while (l < r) {
            System.out.println("l: "+s.charAt(l)+" r: "+s.charAt(r));
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
