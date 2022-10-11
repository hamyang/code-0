package 抽象类特点;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        抽象类参照多态方式创建对象
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
//总结
//抽象类和抽象方法必须使用abstract关键字修饰
//  public abstract class 类名{};
//  public abstract void eat();
//抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
//抽象类不能实列化
//  抽象类如何实列化呢？参照多态的方式，通过子类对象实列化，这叫抽象多态
//  抽象类的子类
//  要么重写抽象类中的所有方法
//  要么是抽象类
