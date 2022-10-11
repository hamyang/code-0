package 排序算法;
/*当数据特别大的时候，就有可能出现最后一个数要向最前面的数据交换，所以会浪费很大时间,于是就出现了移位法*/
import java.util.Arrays;

public class 希尔排序优化_位移式 {
    public static void main(String[] args) {
        int[] array = {76, 45, 8, 43, 5};
        shellSort2(array);
    }

    public static void shellSort2(int[] arr) {
        // 减小增长量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 依次遍历每一个元素
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                // 判断是否满足条件
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
