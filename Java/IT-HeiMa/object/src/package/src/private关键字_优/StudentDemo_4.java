package private关键字_优;
//学生测试类
public class StudentDemo_4 {
    public static void main(String[] args) {
//创建对象
        Student_4 s = new Student_4();
//使用set方法给成员变量赋值
        s.setName("李潇");
        s.setAge(19);
        s.show();
//使用get方法获取成员变量的值
        System.out.println(s.getName()+"--"+s.getAge());
    }
}
