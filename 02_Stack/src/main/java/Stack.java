
public interface Stack<E> {

    int getSize();      // 获取栈的大小
    boolean isEmpty();  // 栈是否为空
    void push(E e);     // 将元素e压入栈顶
    E pop();            // 将栈顶元素弹出
    E peek();           // 查看栈顶元素

}

