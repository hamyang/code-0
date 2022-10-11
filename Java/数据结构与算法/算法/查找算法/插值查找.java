package 查找算法;

public class 插值查找 {
    //应用场景对数据量较大，关键字分布比较均匀
    // 前提是有序列表
// 对有多个相同查找数的情况
    public static void main(String[] args) {
        int[] arr = {32, 54, 64, 75, 79, 98, 123, 123, 342, 643};
        int integers = insertVAlueSearch(arr, 0, arr.length - 1, 54);
        System.out.println("所有满足元素的下标为:" + integers);
    }

    public static int insertVAlueSearch(int[] arr, int left, int right, int findVal) {
        System.out.println("2");
        // 没有找到的情况
        // 如果findVal小于最小的大于最大的提前终止
        if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
            return -1;
        }
        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);//中下标
        int midVal = arr[mid];// 下标对应的值
        if (findVal > midVal) {
            return insertVAlueSearch(arr, mid + 1, right, findVal);// 向右递归
        } else if (findVal < midVal) {
            return insertVAlueSearch(arr, left, mid - 1, findVal);// 向左递归
        } else {
            return mid;
        }
    }
}
