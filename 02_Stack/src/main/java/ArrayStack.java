
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

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');

        for (int i = 0; i < data.getSize(); i++) {
            res.append(data.get(i));
            res.append(", ");
        }

        int indexOf = res.lastIndexOf(",");
        res.delete(indexOf, res.length());

        res.append("] top");
        return res.toString();
    }
}

