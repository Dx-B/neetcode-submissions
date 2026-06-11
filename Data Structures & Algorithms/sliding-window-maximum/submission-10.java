class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        int l = 0;
        int r = 0;
        int[] output = new int[nums.length-k+1];
        while (r < nums.length) {
            while (!queue.isEmpty() && nums[queue.getLast()] < nums[r]) {
                queue.pollLast();
            }
            queue.addLast(r);
            if (l > queue.getFirst()) {
                queue.removeFirst();
            }
            if ((r+1) >= k) {
                output[l] = nums[queue.getFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}
