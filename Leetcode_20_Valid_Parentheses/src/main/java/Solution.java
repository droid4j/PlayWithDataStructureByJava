import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {

    /**
     * 思路：什么时候入栈，什么时候出栈，最终合法性判断
     *      1. 当前字符是左括号就入栈
     *      2. 当前字符不是左括号，就要取出栈顶元素
     *      3. 字符串遍历结束，并且栈为空，表示匹配成功
     *      边界值：
     *      1. 检测input合法性，不合法，直接返回false
     *      2. 如果不是左括号，并且栈已经为空，直接返回false，不用再比较当前字符与栈顶元素
     *      3. 不管栈顶元素是什么，只要与当前元素不匹配，直接返回false，不用管其他场景
     *      4. 遍历完整个input还不算完，还要满足栈为空这个条件，才算是匹配成功
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if (s == null || s.length() <= 0) return false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
                if (c == ')' && top != '(') return false;
            }
        }
        return stack.isEmpty();
    }
}
