class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)-'a']++;
        }
        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            if (r < s1.length()) {
                arr2[s2.charAt(r)-'a']++;
            }
            else {
                arr2[s2.charAt(r)-'a']++;
                if (arr2[s2.charAt(l)-'a'] > 0) {
                    arr2[s2.charAt(l)-'a']--;
                }
                l++;
            }
            if (Arrays.equals(arr,arr2)) {
                return true;
            }
        }
        return false;
    }
}
