public class Main {

    public static void main(String[] args) {
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
