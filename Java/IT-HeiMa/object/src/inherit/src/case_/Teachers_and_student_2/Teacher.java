package case_.Teachers_and_student_2;

public class Teacher extends person {

    public Teacher(){};
    public Teacher(String name, int age) {
//        this.Name=name;
//        this.Age=age;私有变量不能访问
        super(name, age);
    }

    public void teach() {
        System.out.println("老师");
    }
}
