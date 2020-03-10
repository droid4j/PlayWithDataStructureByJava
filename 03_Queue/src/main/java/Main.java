
public class Main {

    public static void main(String[] args) {
        Queue<Integer> arrayQueue = new ArrayQueue<>();
        testQueue(arrayQueue);
        System.out.println("-------");
        Queue<Integer> loopQueue = new LoopQueue<>();
        testQueue(loopQueue);
    }

    private static void testQueue(Queue<Integer> queue) {
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
            System.out.println("入队 " + queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println("出队 " + queue);
            }
        }
    }
}
