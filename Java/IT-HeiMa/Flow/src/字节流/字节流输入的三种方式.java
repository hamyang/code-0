package 字节流;

import java.io.FileOutputStream;
import java.io.IOException;

//void write(int b) 将指定的字节写入此文件输出流
//void write(byte[] b) 将b.length字节从指定的字节数组写入此文件输出流
//void write(byte[] b,int off,int len) 将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
public class 字节流输入的三种方式 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\bos.txt");
        fos.write(97);//void write(int b) 将指定的字节写入此文件输出流
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        //void write(byte[] b) 将b.length字节从指定的字节数组写入此文件输出流
        //byte[] bys = {97, 98, 99, 100, 101};
        //byte[] getBytes() 返回字符串对应的字节数组
        byte[] bys = "abcde".getBytes();
        fos.write(bys);
        fos.write(bys, 1, 3);////void write(byte[] b,int off,int len) 将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
    }
}
