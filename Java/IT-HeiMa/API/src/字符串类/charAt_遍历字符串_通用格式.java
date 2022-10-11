package 字符串类;

import java.util.Scanner;

public class charAt_遍历字符串_通用格式 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

//        System.out.println(line.charAt(0));
//        System.out.println(line.charAt(1));
//        System.out.println(line.charAt(2));
//        循环改进

        int a = line.length();
        for (int i = 0; i < a; i++) {
            System.out.print(line.charAt(i));
        }
    }
}
