package 特殊操作流.Properties方法;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//void load(InputStream inStream)	从输入字节流读取属性列表（键和元素对）
//void load(Reader reader)	从输入字符流读取属性列表（键和元素对）
//void store(OutputStream out, String comments)	将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法的格式写入输出字节流
//void store(Writer writer, String comments)	将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
public class Properties和IO流相结合 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到问文件
        //myStore();
        //把文件中的数据加载到集合
        myload();
        myStore();
    }

    private static void myload() throws IOException {
        Properties prop = new Properties();
        //void load(Reader reader)	从输入字符流读取属性列表（键和元素对）
        FileReader fr = new FileReader("D:\\code\\Java\\File\\java.txt");
        prop.load(fr);//void load(Reader reader)以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("itheima001", "林青霞");
        prop.setProperty("itheima002", "黄洋");
        prop.setProperty("itheima003", "张曼玉");
        FileWriter fw = new FileWriter("D:\\code\\Java\\File\\java.txt");
        prop.store(fw, null);//comments为描述信息//void store(Writer writer, String comments) 将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
        fw.close();
    }
}
