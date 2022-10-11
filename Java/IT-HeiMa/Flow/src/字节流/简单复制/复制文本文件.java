package 字节流.简单复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class 复制文本文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\code\\Java\\File\\不期而遇.txt");
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\fox.txt");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}