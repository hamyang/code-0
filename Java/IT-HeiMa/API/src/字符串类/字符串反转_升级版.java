package 字符串类;

import java.util.Scanner;

public class 字符串反转_升级版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        final String s = myRevers(line);
        System.out.println(s);
    }

    public static String myRevers(String s) {
        return new StringBuilder(s).reverse().toString();
/*        StringBuilder sb =new StringBuilder(s);
        sb.reverse();//调用了字符串反转的reverse中的方法
        final String ss = sb.toString();
        return ss;*/
        //升级版
    }

}
