package 字符流;

import java.io.*;

public class 异常处理 {
/*
    //    方法一 : 抛出异常
    public static void fos1() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt", true));
        char[] chs = {'a', 'b', 'c', 'd', 'e', '\n'};
        osw.write(chs);
        osw.close();
    }

    //    方法二  :try...catch
    public static void fos2() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt", true));
            char[] chs = {'a', 'b', 'c', 'd', 'e', '\n'};
            osw.write(chs);
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            释放资源
        }
    }
//    方法三: JDK7改进方案
    public static void fos3() {
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt", true));) {
            char[] chs = {'a', 'b', 'c', 'd', 'e', '\n'};
            osw.write(chs);
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }//自动释放资源
    }
    //    方法四: JDK9改进方案
    public static void fos4() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\bos.txt", true));
        try(osw) {
            char[] chs = {'a', 'b', 'c', 'd', 'e', '\n'};
            osw.write(chs);
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }//自动释放资源
    }
*/

}
