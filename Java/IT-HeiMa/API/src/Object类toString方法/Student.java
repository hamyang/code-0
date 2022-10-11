package Object类toString方法;
/*建议所有子类重写此方法
* 如何重写呢？自动生成即可*/
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {//重写方法
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
