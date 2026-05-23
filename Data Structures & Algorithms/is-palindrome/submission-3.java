class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] a = s.toCharArray();
        int p2 = a.length-1;
        for (int p1 = 0; p1 < a.length; p1++) {
            if (a[p1] != a[p2]) {
                return false;
            } 
        
            p2--;
        }
        return true;
    }
}