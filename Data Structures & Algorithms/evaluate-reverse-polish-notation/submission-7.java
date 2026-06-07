class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        if (tokens.length == 0) {
            return 0;
        }
        for (String c : tokens) {
            int a = 0;
            int b = 0;
            if (c.equals("+")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a+b));
            }
            else if (c.equals("-")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b-a));
            }
            else if (c.equals("*")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(a*b));
            }
            else if (c.equals("/")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b/a));
            }
            else {
                stack.push(c);
            }
            System.out.println(stack);
        }
        return Integer.parseInt(stack.pop());
    }
}
