package 排序算法;
import java.util.Arrays;
/* 希尔排序是对直接插入排序的优化。
 当gap > 1时都是预排序，目的是让数组更接近于有序。当gap == 1时，数组已经接近有序的了，这样就 会很快。
 这样整体而言，可以达到优化的效果。我们实现后可以进行性能测试的对比。
 希尔排序的时间复杂度不好计算，需要进行推导，推导出来平均时间复杂度： O(N^1.3—N^2）
 稳定性：不稳定*/
public class 希尔排序法_交换式 {
    public static void main(String[] args) {
        int[] array = {76, 45, 8, 43, 5};
        shellSprt(array);
    }
    /**
     * @param arr 为数组
     */
    public static void shellSprt(int[] arr) {
        int temp;
        // 减小增长量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 依次遍历每一个元素
            for (int i = 0; i < arr.length; i++) {
                // 执行增长量的排序
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 判断
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

