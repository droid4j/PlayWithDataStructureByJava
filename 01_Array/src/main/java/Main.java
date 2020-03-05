public class Main {

    public static void main(String[] args) {
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        // [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);
    }

    private static void test() {
        // 声明数组  开辟空间 指定数组大小
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // 开辟有三个空间的数组
        int[] scores = new int[]{100, 85, 66};
        for (int score : scores) {
            System.out.println(score);
        }

        scores[1] = 99;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
