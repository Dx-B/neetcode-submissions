public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '}' || c == ')' || c == ']') {
                if (!stack.isEmpty()) {
                    if (c == '}' && stack.peek() == '{') {
                        stack.pop();
                    }
                    else if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    }
                    else if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}