package 字节流.简单复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制图片 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\21781\\Pictures\\Camera Roll\\sw.jpg");
        FileOutputStream fos =new FileOutputStream("D:\\code\\Java\\File\\mn.jpg");

        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
