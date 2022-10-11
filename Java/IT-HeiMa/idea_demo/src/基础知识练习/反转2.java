package 基础知识练习;

public class 反转2 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        printArray(arr);
    }

    public static int printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        return 0;
    }
}
