package 查找算法;

public class 二分查找 {
    // 二分查找的数组必须是有序的
    public static void main(String[] args) {
        int[] arr = {32, 54, 67, 98, 123, 547};
        int i = binarySearch(arr, 0, arr.length - 1, 48);
        if (i==-1){
            System.out.println("未找到该值");
        }else {
            System.out.println("该值的下标为:"+i);
        }
    }

    /**
     * @param arr     数组
     * @param left    左边的索引
     * @param right   右边的索引
     * @param findVal 要查找的值
     * @return 找到返回下标，没有找到返回-1
     */
    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        if (left>right){
            return -1;
        }
        int mid = (left + right) / 2;//中下标
        int midVal = arr[mid];// 下标对应的值

        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);// 向右递归
        } else if (findVal<midVal){
            return binarySearch(arr, left, mid - 1, findVal);// 向左递归
        }else {
            return mid;
        }
    }
}

