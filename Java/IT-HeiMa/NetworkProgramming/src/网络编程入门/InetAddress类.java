package 网络编程入门;

import java.net.InetAddress;
import java.net.UnknownHostException;

//static InetAddress getByName(String host) 确定主机名称的IP地址。
//String getHostName() 获取此IP地址的主机名。
//String getHostAddress() 返回文本显示中的IP地址字符串。
public class InetAddress类 {
    public static void main(String[] args) throws UnknownHostException {
         InetAddress address = InetAddress.getByName("DESKTOP-F0EJ7IP");

        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println("主机名:"+name);
        System.out.println("ip地址:"+ip);
    }
}
