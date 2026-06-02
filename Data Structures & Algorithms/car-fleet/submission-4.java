class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(b[0],a[0]));
        for (int[] c : arr) {
            stack.push((double) (target-c[0])/c[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size()-2)) {
                stack.pop();
            }
        }
        return stack.size();
    }
}
