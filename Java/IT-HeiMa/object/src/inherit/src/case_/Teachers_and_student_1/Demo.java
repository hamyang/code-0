package case_.Teachers_and_student_1;

public class Demo {
    public static void main(String[] args) {
//        创建老师类进行测试
        Teacher t1 = new Teacher();//无参
        t1.setName("林青霞");
        t1.setAge(19);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
//          创建学生类
        Teacher t2 = new Teacher("黄洋",19);//带参
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}
