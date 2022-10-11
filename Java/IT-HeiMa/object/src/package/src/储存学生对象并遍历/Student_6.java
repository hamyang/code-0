package 储存学生对象并遍历;

public class Student_6 {
    public int getAge;//public表示对所有用户开放
    private String name;//private表示私有
    private String age;

    public Student_6() {
    }

    public Student_6(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

}


