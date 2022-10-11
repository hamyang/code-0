package Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
//        创建Collection集合对象
        Collection<Student> c = new ArrayList<>();

//        创建学生对象
        Student s1= new Student("林青霞",30);
        Student s2= new Student("黄洋",19);
        Student s3= new Student("葫芦",32);
//        把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
//        遍历集合

        for (Student s : c) {
//            System.out.println(it.next());
//            有可能还要进行其他操作,改进下面方法
            System.out.println(s.getName() + "," + s.getAge());
        }



    }
}
