package 字节流;

import java.io.FileOutputStream;
import java.io.IOException;

public class 异常处理 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\code\\Java\\File\\fox.txt", true);//true追加写入
            for (int i = 0; i < 10; i++) {
                fos.write("hello".getBytes());
                fos.write("\n".getBytes());//换行\n\r
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {//防止空指针异常
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
