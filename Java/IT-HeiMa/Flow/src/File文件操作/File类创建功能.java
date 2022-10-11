package File文件操作;

import java.io.File;
import java.io.IOException;

public class File类创建功能 {
    public static void main(String[] args) throws IOException {
        //创建文件
        File f1 = new File("D:\\code\\Java\\File\\Java.txt");
        System.out.println(f1.createNewFile());//public boolean createNewFile()  此方法返回true，如果指定的文件不存在，并已成功创建。如果该文件存在，该方法返回false。
        //创建目录
        File f2 = new File("D:\\code\\Java\\File\\JavaSE");
        System.out.println(f2.mkdir());//boolean mkdir() 	创建一个目录，它的路径名由当前 File文件操作 对象指定
        //创建多级目录
        File f3 = new File("D:\\code\\Java\\File\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());//boolean mkdirs()    创建一个目录，它的路径名由当前 File文件操作 对象指定

        File srcFolder = new File("D:\\itcast");
        System.out.println(srcFolder.exists());//boolean exists()	测试当前 File文件操作 是否存在
    }
}
