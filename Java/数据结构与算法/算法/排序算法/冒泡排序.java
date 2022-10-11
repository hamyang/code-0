package 排序算法;

import java.util.Arrays;
/*     冒泡排序是一种非常容易理解的排序
     时间复杂度：O(N^2)
     空间复杂度：O(1)
     稳定性：稳定
    缺点：慢，每次只能移动两个相邻的数据；*/
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, 22};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        boolean flag = false;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            // 如果遍历了一整次都没有交换，则直接退出
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
