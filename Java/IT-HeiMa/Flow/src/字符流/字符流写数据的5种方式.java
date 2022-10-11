package 字符流;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*void write(int c)	写一个字符
void write(char[] cbuf)	写入一个字符数组
void write(char[] cbuf, int off, int len)	写入字符数组的一部分
void write(String str)	写一个字符串
void write(String str, int off, int len)	写一个字符串的一部分
刷新和关闭的方法
flush()	刷新流，之后还可以继续写数据
close()	关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
*/
public class 字符流写数据的5种方式 {
    public static void main(String[] args) throws IOException {
        fos1();
        fos2();
        fos3();
        fos4();
        fos5();

    }
//        void write(char[] cbuf)	写入一个字符数组
    public static void fos1() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt",true));
        osw.write("\n");
        osw.write("1");
        osw.write("2");
        osw.write("\n");
        osw.flush();//flush()刷新流，之后还可以继续写数据,字节流写数据要注意的问题要刷新数据才能进入，因为真正写数据是字节流
        osw.close();//close()关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
    }
//    void write(char[] cbuf)	写入一个字符数组
    public static void fos2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt",true));
        char[] chs = {'a','b','c','d','e','\n'};
        osw.write(chs);
        osw.close();
    }
//    void write(char[] cbuf, int off, int len)	写入字符数组的一部分
    public static void fos3() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt",true));
        char[] chs = {'a', 'b', 'c', 'd', 'e','f','\n'};
        osw.write(chs,0, chs.length);
        osw.close();
    }
//void write(String str)	写一个字符串
    public static void fos4() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt",true));
        osw.write("abcdefg\n");
        osw.close();
    }
//void write(String str, int off, int len)	写一个字符串的一部分
    public static void fos5() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt",true));
        osw.write("abcdefgh\n",0,"abcoefgh".length());
        osw.close();
    }
}
