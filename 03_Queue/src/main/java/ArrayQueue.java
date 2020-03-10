/**
 * 队列
 *  FIFO
 *  先进先出
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e); // 入队，加到数组末尾
    }

    @Override
    public E dequeue() {
        return array.removeFirst(); // 出队，移出数组中第一个元素
    }

    @Override
    public E getFront() {
        return array.getFirst(); // 查看队头，获取数组中第一个元素
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize()-1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
