package 排序算法;
import java.util.Date;
import static 排序算法.希尔排序法_交换式.shellSprt;

class CS {
    public static void main(String[] args) {
        int[] arr2 = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr2[i] = (int) (Math.random() * 80000);
        }
        Date date1 = new Date();
        System.out.println("排序前时间" + date1);
        // 调用算法
        shellSprt(arr2);

        Date date2 = new Date();
        System.out.println("排序后时间" + date2);
        long num = date2.getTime() - date1.getTime();
        System.out.println(num);
    }
}