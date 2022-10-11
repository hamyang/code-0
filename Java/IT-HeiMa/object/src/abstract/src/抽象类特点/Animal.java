package 抽象类特点;

//  抽象类
public abstract class Animal {
    //抽象方法
    public abstract void eat();
    //非抽象方法  ,抽象类里面可以有
    public void sleep() {
        System.out.println("睡觉");
    }
}
