package 特殊操作流;

import java.io.*;

public class 复制Java文件_打印流改进版 {
     public static void main(String[] args) throws IOException {
        //字符打印流
        BufferedReader br=new BufferedReader(new FileReader("D:\\itcast_1\\中华作文.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\code\\Java\\File\\java.txt"),true);
         String line;
         while ((line = br.readLine())!=null){
             pw.println(line);
         }
         pw.close();
         br.close();
     }
}
