package set集合;

import java.util.HashSet;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建Hashset集合对象
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("林青霞", 29);
        Student s2 = new Student("黄洋", 29);
        Student s3 = new Student("李志强", 29);
        Student s4 = new Student("吴强", 29);
        Student s5 = new Student("吴强", 29);
        //为了包装元素的唯一性，需要在student重写equals方法和hashCode方法
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
