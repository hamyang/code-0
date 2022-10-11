package 基础知识练习;

public class 不死神兔 {
    public static void main(String[] args) {
        int[] arr = new int[20];//自定义数组
        arr[0] = 1; // 第一个月兔子的数量，1对
        arr[1] = 1; // 第二个月兔子的数量，1对
        int sum = 2; // 用于记录兔子总数量，现在初始化为前两个月兔子的总数，2对
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];//从第三个月开始，当前月兔子对数是前两个月兔子对数的和，所以求当前月兔子对数的核心代码是arr[i] = arr[i - 2] + arr[i - 1];

            System.out.println("第" + (i + 1) + "个月兔子的对数为：\t" + arr[i]);
            sum += arr[i];
        }
        System.out.println("兔子总对数：\t\t" + sum);
    }
 }

