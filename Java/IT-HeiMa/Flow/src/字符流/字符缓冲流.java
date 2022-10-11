package 字符流;

import java.io.*;

//构造方法
//BufferedWriter(Writer out)
//BufferedReader(Reader in)
public class 字符缓冲流 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\code\\Java\\File\\java.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hwllo\n");
        bw.write("world");
        bw.close();
//        一次读取一个字符数组数据
        BufferedReader br= new BufferedReader(new FileReader("D:\\code\\Java\\File\\java.txt"));
        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
}
