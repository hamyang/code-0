package 状态修饰符.static修饰符.Static;
public class StaticDemo {
    public static void main(String[] args) {
        Student.university="共同大学";//b.建议使用类名访问
        Student s1 = new Student();
        s1.name ="林青霞";
        s1.age = 19;
//        s1.university="复旦大学";a.不建议用对象名访问，使用上面类名方法访问
        s1.show();
        Student s2 =new Student();
        s2.name="风清扬";
        s2.age = 22;
//        s2.university = "南开大学";
        s2.show();
    }
}