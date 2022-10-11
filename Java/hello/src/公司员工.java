public class 公司员工 {
    public static void main(String[] args) {

        Employee em = new Employee("张三","男",36,6000);
        em.info();

        Employee em2 = new Employee();
        em2.setName("张三");
        em2.setSex("男");
        em2.setAge(36);
        em2.setWage(6000);
        em2.info();
    }
}

class Employee {
    private String name;
    private String sex;
    private int age;
    private int wage;

    public Employee(String name, String sex, int age, int wage) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.wage = wage;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void info() {
        System.out.println(name+","+sex+","+age+","+wage);
    }

}
