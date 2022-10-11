package 排序算法;
import java.util.Arrays;
/*
 元素集合越接近有序，直接插入排序算法的时间效率越高
     时间复杂度：O(N^2)
     空间复杂度：O(1)，它是一种稳定的排序算法
     稳定性：稳定*/
public class 插入排序 {
    public static void main(String[] args) {
        int[] array = {76, 45, 8, 43, 5};
        insertSort(array);
    }
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 保存这个值
            int temp = array[i];
            int num = i - 1;
            // 后移
            while (num >= 0 && temp < array[num]) {
                array[num + 1] = array[num];
                num--;
            }
            // 交换
            if (num + 1 != i) { // 说明执行了后移
                array[num + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}








