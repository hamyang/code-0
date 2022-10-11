import java.util.*;

public class 数组排序方法 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    //Arrays方法sort进行字符串排序
    private static void method1() {
        int[] array = {23, 34, 65, 7, 87, 78, 4, 32, 64};
        Arrays.sort(array);
        System.out.println("排序后：" + Arrays.toString(array));
    }

    //冒泡排序
    private static void method2() {
        int a;
        int[] array = {23, 34, 65, 7, 87, 78, 4, 32, 64};
        int x = array.length;
        while (x > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            x--;
        }
        System.out.println("冒泡排序后：" + Arrays.toString(array));
    }

    //选择排序

}
