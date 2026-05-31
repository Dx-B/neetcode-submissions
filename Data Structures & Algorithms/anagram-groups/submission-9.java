class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for (String c : strs) {
            char[] a = c.toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(c);
            }
            else {
                map.put(sorted, new ArrayList<String>());
                map.get(sorted).add(c);
            }
        }
        return new ArrayList<>(map.values());
    }
}
