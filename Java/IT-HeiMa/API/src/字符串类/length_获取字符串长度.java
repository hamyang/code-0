package 字符串类;

import java.util.Scanner;

public class length_获取字符串长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        System.out.println(line.length());

    }
}
