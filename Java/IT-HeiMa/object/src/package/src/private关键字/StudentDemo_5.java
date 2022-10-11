package private关键字;

//    学生测试类
public class StudentDemo_5 {
    public static void main(String[] args) {
        //创建对象
        Student_5 s = new Student_5();
        Student_5 s1 = new Student_5();
        //   使用对象
        //   System.out.println(s.name + "," + s.age);
        //   给成员变量赋值
        s.name = "林青霞";
        s.setAge(31);
        //调用方法
        s1.study();
        s.doHomework();
        s.show();
    }
}
