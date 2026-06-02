class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //4,1,0,7 -- 2,2,1,1
        // target-position/speed
        //3, 4.5, 10, 3 -> 3

        //1,4 -- 3,2
        //3,3 -> 1

        //10,8,0,5,3 -- 2,4,1,1,3 -- t=12
        //1,1,0,7,3

        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0],a[0]));
        Stack<Double> stack = new Stack<>();
        for (int[] c : pair) {
            stack.push((double) (target-c[0])/c[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size()-2)) {
                stack.pop();
            }
        }
        return stack.size();
    }
}
