package StringBuilder类;

import java.lang.StringBuilder;

public class StringBuilder和String的互换 {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        //String s = sb;    这个方法是错误的
        //public String toString(): 通过toString（）就可以把StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);
        //String 转换为 StringBuilder
        String ss = "hello";
        //StringBuilder sb=a;  这个是错误的方法
        //通过构造方法就可以实现把String转换为StringBuilder
        StringBuilder sbb = new StringBuilder(ss);
        System.out.println(sbb);

    }
}
