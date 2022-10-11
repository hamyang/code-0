package 状态修饰符.static修饰符.Static;
public class Student {
    public String name;//姓名
    public int age;//年龄
    static String university;
    //public String university;//学校
    //static 表示对类所有对象共享
    //也是我们判断是否使用静态关键字的条件
    //列;饮水机不会给每个人配备，饮水机是共享的
    //但是我们一定不会给所有人只配一个水杯，因为水杯是每个人特有的
    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}
