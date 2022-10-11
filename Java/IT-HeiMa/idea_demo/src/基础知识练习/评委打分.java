package 基础知识练习;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int[] arr = new int[6];
        while (x < 6) {
            System.out.println("请输入第"+(x+1)+"个评委的成绩");
            int number = sc.nextInt();
            arr[x] = number;
            x++;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        int i = 1;
        int b = 0;
        int z = 0;
        int max = arr[0];
        int min = arr[0];
        while (i < 6) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        while (b < 6) {
            z += arr[b];
            b++;
        }
        int p = (z - min - max) / 4;
        System.out.println("最终成绩为"+p);

    }

}
