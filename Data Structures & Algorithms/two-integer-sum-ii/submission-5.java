class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int key = numbers[i];
            int complement = target - key;
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i+1};
            }
            else {
                map.put(key, i+1);
            }
        }
        return new int[]{};
    }
}
