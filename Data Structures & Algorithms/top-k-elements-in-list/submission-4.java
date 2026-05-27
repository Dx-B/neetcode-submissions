public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length+1];
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int c : nums) {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        int index = 0;
        int[] output = new int[k];
        for (int i = buckets.length-1; i > 0; i--) {
            for (int c : buckets[i]) {
                output[index++] = c;
                if (index == k) {
                    return output;
                }
            }
        }
        return output;
    }
}