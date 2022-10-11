package 特殊操作流.反序列化流;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 42L;//保证修改对象所属的类文件ID值唯一
    private String name;
    private transient int age;//被transient修饰的对象不参与序列化过程

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
