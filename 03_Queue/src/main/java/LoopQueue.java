
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int size;
    private int front, tail;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
        front = 0;
        tail = 0;
    }

    public LoopQueue() {
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length - 1; // 有意浪费一个空间
    }

    @Override
    public boolean isEmpty() {
        return front == tail; // 首尾相遇，表示队列为空
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
