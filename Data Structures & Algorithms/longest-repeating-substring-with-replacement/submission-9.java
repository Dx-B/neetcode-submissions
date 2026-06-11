class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        int maxL = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (l < s.length() && r < s.length()) {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            max = Math.max(max,map.get(s.charAt(r)));
            int replacements = (r-l+1)-max;
            if (replacements > k) {
                if (map.get(s.charAt(l)) < 1) {
                    map.remove(s.charAt(l));
                }
                else {
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                }
                l++;
            }
            r++;
            maxL=Math.max(maxL,(r-l));
        }
        return maxL;
    }
}
