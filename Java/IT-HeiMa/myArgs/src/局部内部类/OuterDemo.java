package 局部内部类;

//import 成员内部类.Outer;

//测试
public class OuterDemo {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.method();
    }
}
//总结
//局部内部内是在方法中定义的类，所以外界是无法直接使用的，
//需要在方法内部创建对象并使用该类可以直接访问外部类的成员，也可以访问方法内的局部变量
