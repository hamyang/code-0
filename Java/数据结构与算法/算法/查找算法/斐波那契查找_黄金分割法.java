package 查找算法;

import java.util.Arrays;

public class 斐波那契查找_黄金分割法 {
    // 定义了20个长度的斐波那契数列
    static int maxSize = 20;
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1234};
        System.out.println("index:" + fibSearch(arr, 1));
    }

    /**
     * @return 斐波那契数组
     */
    public static int[] fib() {
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
    /**
     * 非递归方式
     * @param a   数组
     * @param key 我们需要查找的关键码
     * @return 返回对应的下标，没有返回-1
     */
    public static int fibSearch(int[] a, int key) {
        int mid;
        int k = 0;
        int low = 0;
        int[] f = fib();
        int high = a.length - 1;
        while (high > f[k] - 1) {
            k++;
        }
        int[] temp = Arrays.copyOf(a, f[k]);
        for (int i = high + 1; i < temp.length; i++) {
            temp[i] = a[high];
        }
        while (low <= high) {
            mid = low + f[k - 1] - 1;
            if (key < temp[mid]) {
                high = mid - 1;
                k--;
            } else if (key > temp[mid]) {
                low = mid + 1;
                k -= 2;
            } else {
                return Math.min(mid, high);
            }
        }
        return -1;
    }
}