package 查找算法;

import java.util.ArrayList;
import java.util.List;

// 前提是有序列表
// 对有多个相同查找数的情况
public class 二分查找优化 {
    public static void main(String[] args) {
        int[] arr = {32, 54, 64, 75, 79, 98, 123, 123, 342, 643};
        List<Integer> integers = binarySearch2(arr, 0, arr.length - 1, 123);
        System.out.println("所有满足元素的下标为:" + integers);
    }

    public static List<Integer> binarySearch2(int[] arr, int left, int right, int findVal) {
        // 没有找到的情况
        // 如果findVal小于最小的大于最大的提前终止
        if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
            return new ArrayList<>();
        }
        int mid = (left + right) / 2;//中下标
        int midVal = arr[mid];// 下标对应的值

        if (findVal > midVal) {
            return binarySearch2(arr, mid + 1, right, findVal);// 向右递归
        } else if (findVal < midVal) {
            return binarySearch2(arr, left, mid - 1, findVal);// 向左递归
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(mid);
            int temp = mid - 1;
            // 向左递归
            while (temp >= 0 && arr[temp] == findVal) {
                arrayList.add(temp);
                temp -= 1;
            }
            temp = mid + 1;
            // 向右递归
            while (temp <= arr.length - 1 && arr[temp] == findVal) {
                arrayList.add(temp);
                temp += 1;
            }
            return arrayList;
        }
    }
}
