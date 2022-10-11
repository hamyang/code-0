package 特殊操作流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//printWriter (String fileName)  使用指定的文件名创建一个新的printWriter,er
public class 字符打印流 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw1 = new PrintWriter("D:\\code\\Java\\File\\java.txt");
        pw1.write("hello");
        pw1.write("\n\r");
        pw1.flush();//字符流不能直接到文件，需要刷新
        pw1.println("world");
        //pw.println相当于pw.write("world")和pw.write("\n\r");

        //如何自动flush();
        //PrintWriter(Writer out, boolean autoFlush) 创建一个新的PrintWriter。
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\code\\Java\\File\\java.txt"), true);
        pw.println("hello");
        pw.close();
    }
}