package 状态修饰符.final修饰局部变量;

public class FinalDemo {
    public static void main(String[] args) {
        //final 修饰基本类型变量
        final int age=20;
//        age = 100;不能再次被赋值
        System.out.println(age);

        //final 修饰引用类型变量
        final Student s = new Student();//final 修饰的是s s为地址值指的是地址值不能变
//      如  s = new Student();
        s.age = 100;//是s里面的内容
        System.out.println(s.age);
    }
}

//总结
//final修饰基本数据值不能发生改变
//final修饰引用类型的地址值不能发生改变，但地址里面的内容可以发生改变
