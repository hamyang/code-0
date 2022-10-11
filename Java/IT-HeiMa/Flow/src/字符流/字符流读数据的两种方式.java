package 字符流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class 字符流读数据的两种方式 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\File\\bos.txt"));
        fos1();
        fos2();
    }

    public static void fos1() throws IOException {
        //一次一个字符数据
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\File\\bos.txt"));
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        isr.close();
    }

    public static void fos2() throws IOException {
        //一次一个字符数组
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\File\\bos.txt"));
        char[] chs = new char[1024];//1024及其整数倍
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
        isr.close();
    }
}
