class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] fleets = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            fleets[i][0] = position[i];
            fleets[i][1] = speed[i];
        }
        Arrays.sort(fleets, (a,b) -> Integer.compare(b[0],a[0]));
        Stack<Double> stack = new Stack<>();
        for (int[] c : fleets) {
            double time = (double) (target-c[0])/c[1];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
