package 特殊操作流;

import java.io.IOException;
import java.io.PrintStream;

//PrintStream (String fileName) 使用指定的文件创建新的打印流
public class 字节打印流 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("D:\\code\\Java\\File\\java.txt");
        //写数据
        //字节输出流方法
        ps.write(65);
        ps.close();
        //使用特有方法写数据
        ps.print(65);//不会做转码操作
        ps.println();
    }
}
