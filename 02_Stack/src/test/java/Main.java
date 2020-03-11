import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int opCount = 100000;
        ArrayStack<Integer> stack1 = new ArrayStack<>();
        double time1 = testStack(stack1, opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        LinkedListStack<Integer> stack2 = new LinkedListStack<>();
        double time2 = testStack(stack2, opCount);
        System.out.println("LinkedListStack, time: " + time2 + "s");
    }

    private static double testStack(Stack<Integer> stack, int opCount) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        long end = System.nanoTime();
        return (end - start) /  1000000000.0;
    }

    private static void linkedListStack() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }

    private static void arrayStack() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}

