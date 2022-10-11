package 字节流.缓冲流;

import java.io.*;

//字节流一次读写一个数组的速度比一次读写一个字节的速度快很多，这是加入了数组这样的缓冲区效果，
// java本身在设计的时候，也考虑到了这样的设计思想，所以提供了字节缓冲区流
//BufferedOutputStream(OutputStream out)	创建字节缓冲输出流对象
//BufferedInputStream(InputStream in)	创建字节缓冲输入流对象
public class 字节缓冲流 {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流
        //FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\不期而遇.txt");
        //BufferedOutputStream bos = new BufferedOutputStream(fos);
        //合并
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\code\\Java\\File\\bos.txt"));
        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();
        //BufferedInputStream(InputStream in)	创建字节缓冲输入流对象
        //读数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\code\\Java\\File\\bos.txt"));
        byte[] bys = new byte[1024];//1024及其整数倍
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        bis.close();
    }
}
