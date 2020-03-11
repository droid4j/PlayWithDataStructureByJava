
public class LinkedList<E> {

    // private Node head;
    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头添加元素
     * @param e 添加的元素
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 在链表的 index(0-based) 位置添加新的元素e
     * @param index 添加的位置
     * @param e 添加的元素
     *
     *          不是一个常用的操作，练习用
     */
    public void add(int index, E e) {
        Node prev = dummyHead;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;

        // prev.next = new Node(e, prev.next); // 优雅写法

        size++;
    }

    public void addLast(E e) {
        add(size, e);
    }

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
