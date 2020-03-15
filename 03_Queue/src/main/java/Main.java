import java.util.Random;

public class Main {

    public static void main(String[] args) {

        linkedListQueue();

        int opCount = 100000;
        Queue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue2(arrayQueue, opCount);
        System.out.println("ArrayQueue, time: " + time1 + " s");

        System.out.println("-------");
        Queue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue2(loopQueue, opCount);
        System.out.println("LoopQueue, time: " + time2 + " s");

        System.out.println("-------");
        Queue<Integer> linkedListQueue = new LinkedListQueue<>();
        double time3 = testQueue2(linkedListQueue, opCount);
        System.out.println("LinkedListQueue, time: " + time3 + " s");
    }

    private static void linkedListQueue() {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }

    // 测试使用q运行 opCount 个 enqueue 和 dequeue 操作所需要的时间，单位：秒
    private static double testQueue2(Queue<Integer> q, int opCount) {
        long start = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }

        long end = System.nanoTime();
        return (end - start) /  1000000000.0;
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
