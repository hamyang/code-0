package 字符流.集合与文件改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("itheima001","林青霞",30,"西安");
        Student s2 = new Student("itheima002","李武",35,"上海");
        Student s3 = new Student("itheima003","李志强",43,"成都");
        array.add(s1);
        array.add(s2);
        array.add(s3);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\code\\Java\\File\\java.txt"));
        for (Student s:array){
            StringBuilder sb =new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
