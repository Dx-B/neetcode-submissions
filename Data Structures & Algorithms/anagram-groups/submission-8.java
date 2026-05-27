class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for (String c : strs) {
            char[] a = c.toCharArray();
            Arrays.sort(a);
            String b = new String(a);
            if (map.containsKey(b)) {
                map.get(b).add(c);
            }
            else {
                map.put(b, new ArrayList<>());
                map.get(b).add(c);
            }
        }
        return new ArrayList<>(map.values());
    }
}
