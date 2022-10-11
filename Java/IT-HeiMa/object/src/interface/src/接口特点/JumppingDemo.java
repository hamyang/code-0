package 接口特点;

public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j = new Jumpping();
        Jumpping j = new Cat();
        j.jump();
    }
}
//总结
//接口用关键字interface修饰
//  public interface 接口名{}
//实现接口用implements表示
//  public class 类名 implements 接口名{}
//接口不能实列化
//  接口如何实列化呢？参照多态的方式，通过实现类对象实列化，这叫接口多态
//  多态形式：具体类多态，抽象类多态，接口类多态
//  多态前提：有继承或者实现关系；有方法重写；有父(类/接口)引用指向(子/实现)类对象
//接口的实现类
//  要么重写接口中的所有抽象方法
//  要么是抽象类