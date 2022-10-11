package 字符流;

import java.io.*;

//BufferedWriter
//          void newLine() 写一行行分隔符，行分隔符字符串由系统属性定义
//BufferedReader
//          public String readLine() 读一行文字，结果包含行内容的字符串，不包含任何行终止符，如果流的结尾已经到达，则为null
public class 字符缓冲流特有功能 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\code\\Java\\File\\java.txt"));
//        写数据
        for (int i = 0; i < 10; i++) {
            bw.write("hello" + i);
//            bw.write("\n\r");//仅适用于window
            bw.newLine();//使用与所有系统
            bw.flush();
        }
        bw.close();
//        读数据
        BufferedReader br = new BufferedReader(new FileReader("D:\\code\\Java\\File\\java.txt"));
//      public String readLine() 读一行文字，结果包含行内容的字符串，不包含任何行终止符，如果流的结尾已经到达，则为null
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);//不包含任何行终止符如：\n\r
        }
        br.close();



    }
}
