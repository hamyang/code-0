package private关键字_优;
/*
    private
    是一个权限修饰符
    可以修饰成员（成员变量和成员方法）
    作用是保护成员不被别的类使用，被private修饰的成员只在本类中才能访问

    //如果需要被其他类使用，提供相应操作
    set变量名（参数）         --设置--返回值--int
    get变量名（）            --获取--输出--void

*/
// 学生类
public class Student_4 {
    //成员变量
    private String name;
    private int age;
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}
