class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String c : strs) {
            char[] a = c.toCharArray();
            Arrays.sort(a);
            String sort = new String(a);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(c);
        }
        return new ArrayList<>(map.values());
    }
}
