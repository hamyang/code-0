package TreeSet集合;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("hy", 21);
        Student s2 = new Student("rwe", 53);
        Student s3 = new Student("gs", 31);
        Student s4 = new Student("gf", 25);
        Student s5 = new Student("find", 51);
        Student s6 = new Student("hy", 21);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student i : ts) {
            System.out.println(i.getName() + "," + i.getAge());
        }
    }
}
//总结
//     用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
//      自然排序，就是让元素所属的实现类实现Comparable接口，重写compareTo(To)方法
//      重写方法是，一定要注意排序规则必须按照要求的主要条件和次要条件来写
