class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (!stack.isEmpty()) {
                    char a = stack.pop();
                    if (c == ')' && a != '(') {
                        return false;
                    }
                    else if (c==']' && a!='[') {
                        return false;
                    }
                    else if (c=='}' && a!='{') {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
