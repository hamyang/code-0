package 特殊操作流.反序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//ObjectOutputStream(OutputStream out) 创建一个写入指定的OutputStream的ObjectOutputStream。
//学生类实现 Serializable接口才可以序列化和反序列化
public class 对象序列化流 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\code\\Java\\File\\java.txt"));
        Student s = new Student("林青霞",30);
        oos.writeObject(s);//void writeObject(Object obj) 将指定的对象写入ObjectOutputStream。
        oos.close();
    }
}