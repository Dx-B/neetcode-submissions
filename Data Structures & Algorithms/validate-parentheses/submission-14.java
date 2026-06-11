class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char a = stack.pop();
                if (a == '{' && c != '}') {
                    return false;
                }
                if (a == '[' && c != ']') {
                    return false;
                }
                if (a == '(' && c != ')') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
