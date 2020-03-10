
public interface Queue<E> {

    int getSize(); // 队列大小
    boolean isEmpty(); // 队列是否为空
    void enqueue(E e); // 入队
    E dequeue(); // 出队
    E getFront(); // 查看队头
}
