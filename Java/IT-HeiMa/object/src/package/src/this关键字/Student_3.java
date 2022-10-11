package this关键字;

public class Student_3 {
    //成员变量
    private String name;
    private int age;

    //局部变量指代成员变量用this修饰
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }

}
