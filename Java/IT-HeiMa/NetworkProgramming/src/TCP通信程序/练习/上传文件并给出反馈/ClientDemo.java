package TCP通信程序.练习.上传文件并给出反馈;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("DESKTOP-F0EJ7IP", 10086);
//        封装文本文件数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        s.shutdownInput();//结束标记，最好方案
//        接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();//等待读取数据
        System.out.println("服务器的反馈:"+data);
        s.close();
        br.close();
    }
}
