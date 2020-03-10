
public class Main {

    public static void main(String[] args) {
        String[] inputs = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        Solution solution = new Solution();
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("输入：" + inputs[i]);
            System.out.println("输出：" + solution.isValid(inputs[i]));
        }
    }
}
