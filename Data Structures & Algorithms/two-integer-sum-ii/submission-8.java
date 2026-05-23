class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int sum = numbers[i]+numbers[j];
        while (sum != target) {
            sum = numbers[i]+numbers[j];
            if (sum < target) {
                i++;
            }
            if (sum > target) {
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}
