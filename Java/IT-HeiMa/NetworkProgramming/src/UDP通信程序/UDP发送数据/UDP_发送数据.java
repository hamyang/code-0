package UDP通信程序.UDP发送数据;

import java.io.IOException;
import java.net.*;
//1.创建发送端的Socket对象(DatagramSocket)
//2.创建数据，并把数据打包
//3.调用DatagramSocket对象的方法发送数据
//4.关闭发送端
public class UDP_发送数据 {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socket对象(DatagramSocket)
        //DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket();
        //2.创建数据，并把数据打包
        //  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
        byte[] bys = "hello,udp,我来了".getBytes();
/*
   int length = bys.length;
   InetAddress address = InetAddress.getByName("DESKTOP-F0EJ7IP");
   int port = 10086;
   DatagramPacket dp = new DatagramPacket(bys,length,address,port);
*/
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("DESKTOP-F0EJ7IP"), 10086);
        //3.调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p) 从此套接字发送数据报包。
        ds.send(dp);
        //4.关闭发送端
        ds.close();
    }
}
