package 字符流;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//FileReader 用于读取字符文件的便捷类
//FileWriter 用于写入字符文件的便捷类
public class 复制文件改进FileReader便捷类 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\code\\Java\\IT-HeiMa\\hello\\src\\Fibonacci数列.java");
        FileWriter fw = new FileWriter("D:\\code\\Java\\File\\java.txt");
            char[] chs = new char[1024];
            int len;
            while ((len=fr.read(chs))!=-1){
                fw.write(chs,0,len);
            }
            fr.close();
            fw.close();
        }
    }

