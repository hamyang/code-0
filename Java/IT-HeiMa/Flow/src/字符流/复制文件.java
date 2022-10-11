package 字符流;

import java.io.*;

public class 复制文件 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\IT-HeiMa\\hello\\src\\Fibonacci数列.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\字符流文件.txt"));
//        一次一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }
        osw.close();
        isr.close();
    }
}
