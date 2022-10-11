package List集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> List = new ArrayList<Student>();
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("埼玉", 32);
        Student s3 = new Student("刘诗雯", 19);

        List.add(s1);
        List.add(s2);
        List.add(s3);
        //迭代器遍历
        for (Student s : List) {
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("-----");
        //for循环遍历
        for (Student s : List) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
