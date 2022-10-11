package TCP通信程序.练习.服务器给出反馈;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("DESKTOP-F0EJ7IP",1000);
        OutputStream os = s.getOutputStream();
        os.write("你好".getBytes());
        s.close();
    }
}
