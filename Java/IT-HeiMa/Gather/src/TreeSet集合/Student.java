package TreeSet集合;

public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student i) {
//        return 0;
//        return 1; 升序
//        return -1;降序
//        按照年龄从小到大排序
        int num =this.age-i.age;
//        return num;
//        年龄相同时，按照姓名的字母排序
        return num==0? this.name.compareTo(i.name):num;
    }
/*compareTo() 方法用于将 Number 对象与方法的参数进行比较。可用于比较 Byte, Long, Integer等。
该方法用于两个相同数据类型的比较，两个不同类型的数据不能用此方法来比较。
如果指定的数与参数相等返回 0。
如果指定的数小于参数返回 -1。
如果指定的数大于参数返回 1。*/
}
