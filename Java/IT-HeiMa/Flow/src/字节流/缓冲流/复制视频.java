package 字节流.缓冲流;

import java.io.*;

public class 复制视频 {
    public static void main(String[] args) throws IOException {
        //开始记录时间
        long start = System.currentTimeMillis();
        //fos1();//共耗时9265毫秒
        //fos2();//共耗时16毫秒
        //fos3();//共耗时74毫秒
        //fos4();//共耗时4毫秒

        //结束记录时间
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");

    }

    //基本字节流一次读写一个字节
    public static void fos1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\21781\\Videos\\Captures\\sp.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\sp.mp4");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

    //基本字节流一次读写一个字节数组
    public static void fos2() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\21781\\Videos\\Captures\\sp.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\sp.mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();
    }

    //字节换缓冲流一次读写一个字节
    public static void fos3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\21781\\Videos\\Captures\\sp.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\code\\Java\\File\\sp.mp4"));
        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    //字节缓冲流一次读写一个字节数组
    public static void fos4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\21781\\Videos\\Captures\\sp.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\code\\Java\\File\\sp.mp4"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }


}
