class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String c : strs) {
            s.append(c.length()).append('#').append(c);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        // 5#hello5#world
        ArrayList<String> output = new ArrayList<>();
        int l = 0;
        int r = l+1;
        while (l < str.length()) {
            while (str.charAt(r) != '#' && r < str.length()) {
                r++;
            }
            int length = Integer.parseInt(str.substring(l,r));
            l = r+1;
            r = l+length;
            output.add(str.substring(l,r));
            l = r;
        }
        return output;
    }
}
