class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();
        for (String c : strs) {
            output.append(c.length()).append('#').append(c);
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+length;
            output.add(str.substring(i,j));
            i=j;
        }
        return output;
    }
}
