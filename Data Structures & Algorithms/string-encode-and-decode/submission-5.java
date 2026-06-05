class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String c : strs) {
            s.append(c.length()).append('#').append(c);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> output = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (l < str.length()) {
            while (str.charAt(r) != '#') {
                r++;
            }
            int ext = Integer.parseInt(str.substring(l,r));
            l = r+1;
            r = l+ext;
            output.add(str.substring(l,r));
            l = r;
        }
        return output;
    }
}
