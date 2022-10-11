package this关键字;

//学生测试类
public class StudentDemo_3 {
    public static void main(String[] args) {
        //创建对象
        Student_3 s = new Student_3();
        //使用set方法给成员变量赋值
        s.setName("李潇");
        s.setAge(19);
        s.show();
        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "," + s.getAge());

    }
}
