package TCP通信程序.练习.上传文件并给出反馈;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10086);
//        监听客户端连接，返回一个对应的Socker对象
        Socket s = ss.accept();
//        接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        把数据写入文本
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\code\\Java\\File\\总结.txt"));
        String line;
        while ((line = br.readLine()) != null) {//等待读取数据
//            if ("886".equals(line)) {
//                break;
//            }
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

//        给出反馈
        BufferedWriter bwserver = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwserver.write("文件上传成功");
        bwserver.newLine();
        bw.flush();
        bw.close();
        ss.close();
    }
}
