
public class Solution {

    public boolean isValid(String s) {
        if (s == null || s.length() <= 0) return false;

        Stack<Character> stack = new ArrayStack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                // 遍历到右括号的匹配规则
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
                if (c == ')' && top != '(') return false;
            }
        }
        return stack.isEmpty();
    }
}
