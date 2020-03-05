public class Array<E> {

    private E[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity，构造Array
     * @param capacity 指定容量
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity]; // 泛型类型，不能直接创建对象，需要借助 Object，然后强转为 E 类型
        size = 0;
    }

    /**
     * 无参构造函数，默认的数组容量 capacity = 10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组中元素个数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向所有元素后添加一个元素
     * @param e 要添加的元素，int类型
     */
    public void addLast(E e) {
        add(size, e); // 重构，向所有元素后添加一个元素，也就是向size位置添加元素
    }

    /**
     * 在所有元素前添加一个元素
     * @param e 要添加的元素，int类型
     */
    public void addFirst(E e) {
        add(0, e); // 使用 add 方法，快速实现 addFirst 方法
    }

    /**
     * 在第index位置添加一个新元素e
     * @param index 要添加的位置
     * @param e 要添加的元素，int类型
     */
    public void add(int index, E e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取index索引位置的元素
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }

        return data[index];
    }

    /**
     * 修改index索引位置的元素e
     * @param index 索引
     * @param e 新元素e
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 查找数组中是否有元素e
     * @param e 要查找的元素
     * @return
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) { // 泛型类型，都是对象类型，对象比较使用 equals
                return true;
            }
        }
        return false;
    }

    /**
     * 查找数组中元素e所在的索引
     * @param e 元素e
     * @return 不存在，返回-1
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 从数组中删除index位置的元素
     * @param index 索引
     * @return 返回被删除的元素
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    /**
     * 从数组中删除第一个元素
     * @return 返回被删除的元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 从数组中删除最后一个元素
     * @return 返回被删除的元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 从数组中删除元素e
     * @param e 元素e
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}
