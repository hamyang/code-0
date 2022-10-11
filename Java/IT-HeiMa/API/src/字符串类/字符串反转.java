package 字符串类;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        String s = revers(line);
        System.out.println(s);
    }

    public static String revers(String s) {
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}





