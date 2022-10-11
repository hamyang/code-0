package 字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class 追加写入与换行 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\code\\Java\\File\\fox.txt",true);//true追加写入
        for (int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());//换行\n\r
        }
        fos.close();
    }
}
