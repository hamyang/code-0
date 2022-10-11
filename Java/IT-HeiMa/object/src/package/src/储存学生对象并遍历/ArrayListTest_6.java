package 储存学生对象并遍历;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest_6 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student_6> array = new ArrayList<>();
       addStudent(array);//调用addStudent方法

        //遍历集合
        for (Student_6 s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student_6> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        Student_6 s = new Student_6();
        s.setAge(age);
        s.setName(name);
        array.add(s);//将传入Student_6的数据放入array中最终放入ArrayList集合中
    }
}



