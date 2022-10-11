package 字符流;

import java.io.*;

//InputStreamReader 是从字节流到字符流的桥梁
//      它读取字节，并使用指定的编码将其解码为字符
//      它使用的字符集可以由名称指定,也可以被明确指定,或者可以接受平台默认字符集
//OutputStreamWriter 是从字符流到字节流的桥梁
//      是从字符流到字节流的桥梁,使用指定的编码将写入的字符编码为字节
//      它使用的字符集可以由名称指定,也可以被明确指定,或者可以接受平台的默认字符集
public class 编码与解码2 {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter(OutputStream out)创建一个使用默认字符编码的OutputStreamWriter。
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java\\File\\bos.txt");
        OutputStreamWriter osw =new OutputStreamWriter(fos);
        osw.write("中国,");
        osw.close();
//        OutputStreamWriter(OutputStream out, Charset cs)创建一个使用给定字符集的OutputStreamWriter。
        FileOutputStream fos1 = new FileOutputStream("D:\\code\\Java\\File\\bos.txt");
        OutputStreamWriter osw1 =new OutputStreamWriter(fos1,"GBK");
        osw1.write("中国人,");
        osw1.close();

//        InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\File\\bos.txt"),"GBK");
//        一次读取一个字符数据
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.println((char)ch);
        }
        isr.close();
//        InputStreamReader(InputStream in, Charset cs) 创建一个使用给定字符集的InputStreamReader。
    }
}
