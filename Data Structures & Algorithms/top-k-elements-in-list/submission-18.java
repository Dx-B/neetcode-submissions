class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length+1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int c : nums) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        int count = 0;
        int[] output = new int[k];
        for (int i = buckets.length-1; i >= 0 && count < k; i--) {
            for (int c : buckets[i]) {
                output[count++] = c;
            }
        }
        return output;
    }
}
