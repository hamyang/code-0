package 特殊操作流.反序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//ObjectInputStream(InputStream in) 创建从指定的InputStream读取的ObjectInputStream。
public class 对象反序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\code\\Java\\File\\java.txt"));
        Object obj = ois.readObject();//Object readObject() 从ObjectInputStream读取一个对象。
        Student s = (Student) obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}