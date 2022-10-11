package TreeSet集合.带参构造方法;

import java.util.Comparator;
import java.util.TreeSet;
/*TreeSet提供了四种构造器
比较器
TreeSet()
TreeSet(Collection< ? extends E> c)
TreeSet(Comparator< ? super E> comparator)
TreeSet(SortedSet< E > s)*/
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge()- s2.getAge();
                return num ==0?s1.getName().compareTo(s2.getName()):num;
            }
        });

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

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
