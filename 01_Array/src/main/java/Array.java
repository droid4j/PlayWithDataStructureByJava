public class Array {

    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity，构造Array
     * @param capacity 指定容量
     */
    public Array(int capacity) {
        data = new int[capacity];
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
    public void addLast(int e) {
        add(size, e); // 重构，向所有元素后添加一个元素，也就是向size位置添加元素
    }

    /**
     * 在所有元素前添加一个元素
     * @param e 要添加的元素，int类型
     */
    public void addFirst(int e) {
        add(0, e); // 使用 add 方法，快速实现 addFirst 方法
    }

    /**
     * 在第index位置添加一个新元素e
     * @param index 要添加的位置
     * @param e 要添加的元素，int类型
     */
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        for (int i = size; i >= index; i--) {
            data[size + 1] = data[size];
        }
        data[index] = e;
        size++;
    }
}
