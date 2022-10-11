package TCP通信程序.TCP发送数据;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//1.创建客户端的Socket对象(Socket)
//2.获取输出流，写数据
//3.释放资源
public class TCP发送数据_ {
    public static void main(String[] args) throws IOException {
        //1.创建客户端的Socket对象(Socket)
//Socket(InetAddress address, int port) 创建流套接字并将其连接到指定IP地址的指定端口号。
//Socket s = new Socket(InetAddress.getByName("DESKTOP-F0EJ7IP"),10086);
//Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s = new Socket("DESKTOP-F0EJ7IP", 10086);
        //2.获取输出流，写数据
//OutputStream getOutputStream() 返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write("hello,TCP我来了".getBytes());
        s.close();
    }
}
