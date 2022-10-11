package 排序算法;
/*简单选择排序其实就是每次都选出未处理的元素中最小或最大的元素与未处理部分的第一个元素交换，直到有序。
 显然，要想知道是否到达有序，总要进行完所有的比较，也就是无论这个数组的有序性怎样，都要比较n*(n-1)/2次，时间复杂度为O(n2) 。*/
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
/*    直接选择排序思考非常好理解，但是效率不是很好。实际中很少使用
    时间复杂度：O(N^2)
    空间复杂度：O(1)
    稳定性：不稳定*/
public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {132, 342, 123, 43, 23};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                // 查找数组最小值
                if (min > arr[j]) {
                    min = arr[j]; // 重置最小值，并未交换
                    minIndex = j;// 记录最小值位置
                }
            }
            // 执行交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
