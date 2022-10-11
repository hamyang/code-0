package 字节流;

import java.io.FileInputStream;
import java.io.IOException;

public class 字节流读数据的两种方式 {
    public static void main(String[] args) throws IOException {
        fos1();
        fos2();
    }

    public static void fos1() throws IOException {
        //一次一个字节
        FileInputStream fis = new FileInputStream("D:\\code\\Java\\File\\java.txt");//true追加写入
        int by;
        while ((by = fis.read()) != -1) {
            System.out.println((char) by);
            System.out.println(by);
        }
        fis.close();
    }

    public static void fos2() throws IOException {
        //一次一个字节数组
        FileInputStream fis = new FileInputStream("D:\\code\\Java\\File\\不期而遇.txt");
        byte[] bys = new byte[1024];//1024及其整数倍
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        fis.close();
    }
}