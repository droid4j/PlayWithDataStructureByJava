
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
        for (int i = 0; i < index; i++) {
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

    /**
     * 获取链表第index(0-based)位置的元素
     * @param index 索引
     * @return
     * 在链表中不是一个常用的操作，练习用
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取链表的最后一个元素
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 获取链表的第一个元素
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 修改链表的第index(0-based)位置的元素e
     * @param index 索引
     * @param e 元素
     *
     *          在链表中不是一个常用操作，练习用
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 查找链表中是否有元素e
     * @param e 元素
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
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
