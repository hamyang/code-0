package 特殊操作流;

import java.io.PrintStream;
//PrintStream 方法能够方便打印各种数值
//public static final printStream out :标准输出流
public class 标准输出流 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.println("hello");
        ps.print("100");
        System.out.println();
//        输出语句的本质是标准输出流
//        PrintStream类所有方法，System.out都可以使用
    }
}
