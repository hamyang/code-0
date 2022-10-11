package File文件操作;

import java.io.File;
import java.io.IOException;

//public boolean delete()  删除由次抽象路径名表示的文件或目录
public class File类删除功能 {
    public static void main(String[] args) throws IOException {
        //创建文件
        File f1 = new File("D:\\code\\Java\\File\\Java.txt");
        System.out.println(f1.createNewFile());//public boolean createNewFile()  此方法返回true，如果指定的文件不存在，并已成功创建。如果该文件存在，该方法返回false。
        //创建目录
        File f2 = new File("D:\\code\\Java\\File\\JavaSE");
        System.out.println(f2.mkdir());
        //删除文件
        System.out.println(f1.delete());//boolean delete()	删除当前对象指定的文件
        //删除目录
        System.out.println(f2.delete());//boolean delete()	删除当前对象指定的文件
    }
}
