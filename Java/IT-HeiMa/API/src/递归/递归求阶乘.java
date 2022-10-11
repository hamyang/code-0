package 递归;

import java.util.Scanner;

public class 递归求阶乘 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小于10000的数");
        int num = sc.nextInt();*/
        int num=6;
        System.out.println(jc(num));
    }
    public static int jc(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num*jc(num-1);
        }
    }
}
