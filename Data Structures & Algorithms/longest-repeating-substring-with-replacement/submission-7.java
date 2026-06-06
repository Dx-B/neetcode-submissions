class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int maxFreq = 0;
        int replacements = 0;
        int maxWindow = 0;
        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1); // build frequency map, but we're building as we go so potential edge cases?
            maxFreq = Math.max(maxFreq,map.get(s.charAt(r))); // set maxFreq based on each character
            replacements = (r-l+1)-maxFreq; // count replacements window-maxFreq
            if (replacements > k) { // if replacements outgrows k, shrink window
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            maxWindow = Math.max(maxWindow,r-l+1);
        }
        return maxWindow;
    }
}
