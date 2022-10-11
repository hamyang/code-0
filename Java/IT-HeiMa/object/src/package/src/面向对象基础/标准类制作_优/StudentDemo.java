package 面向对象基础.标准类制作_优;

public class StudentDemo {
    public static void main(String[] args) {
        //使用无参构造方法创建对象后使用setxxx（）赋值
        Student s1 = new Student();
        s1.setName("黄洋");
        s1.setAge(19);
        s1.show();
        //使用带参构造方法直接创建带有属性值的对象
        Student s2 = new Student("林青霞", 20);
        s2.show();
    }
}