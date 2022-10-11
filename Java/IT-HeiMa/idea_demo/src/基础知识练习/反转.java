package 基础知识练习;

public class 反转 {
    public static void main(String[] args) {
        int arr[] = {19, 28, 37, 46, 50};
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        arr[0] = arr[4];
        arr[1] = arr[3];
        arr[2] = c;
        arr[3] = b;
        arr[4] = a;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
