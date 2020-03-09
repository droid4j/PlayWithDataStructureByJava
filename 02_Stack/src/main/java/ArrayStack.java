
public class ArrayStack<E> implements Stack<E> {

    private Array<E> data;

    public ArrayStack(int capacity) {
        data = new Array<>(capacity);
    }

    public ArrayStack() {
        data = new Array<>(); // default capacity 10
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int getCapacity() {
        return data.getCapacity();
    }

    @Override
    public void push(E e) {
        data.addLast(e);
    }

    @Override
    public E pop() {
        return data.removeLast();
    }

    @Override
    public E peek() {
        return data.getLast();
    }
}

