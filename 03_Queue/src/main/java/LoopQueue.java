
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int size;
    private int front, tail;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
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
        if ((tail + 1) % data.length == front)
            resize(getCapacity() * 2);

        data[tail] = e;
        tail = (tail + 1) % data.length; // 入队，加入到队尾，维护 tail 指针
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");

        E ret = data[front]; // 出队，取出队首元素
        data[front] = null;
        front = (front + 1) % data.length; // 出队，从队首取出元素，维护 front 指针
        size--;

        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }

        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");

        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d, capacity = %d\n", getSize(), getCapacity()));
        res.append("front [");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1) % data.length != tail) {
                res.append(", ");
            }
        }
        res.append("] tail");

        return res.toString();
    }

    private void resize(int newCapacity) {
        // System.out.println("扩容 old=" + getCapacity() + ", new=" + newCapacity);
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }
}
