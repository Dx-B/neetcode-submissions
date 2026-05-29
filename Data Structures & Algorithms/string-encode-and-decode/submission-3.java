class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for (String c : strs) {
            s.append(c.length()).append('#').append(c);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        int l = 0;

        while (l < str.length()) {

            int r = l;

            // find delimiter #
            while (str.charAt(r) != '#') {
                r++;
            }

            // length before #
            int len = Integer.parseInt(str.substring(l, r));

            // move to start of actual string
            l = r + 1;

            // end of actual string
            r = l + len;

            output.add(str.substring(l, r));

            // move to next encoded section
            l = r;
        }

        return output;
    }
}