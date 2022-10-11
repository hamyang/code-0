package 字节流;

import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream:文件输出流用于将数据写入File
//FileOutputStream(String name)：创建文件输出流指定的名称写入文件
public class 字节流写数据 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\java.txt");
        //写入文件输出流
        fos.write(78);
        //最后释放资源
        fos.close();
    }
}
