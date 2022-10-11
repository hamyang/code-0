package 字符流;

import java.io.*;

public class 复制文件2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\code\\Java\\File\\java.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\code\\Java\\File\\wj.txt"));
        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
