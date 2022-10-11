package 抽象类特点;

public class Cat extends Animal{
    @Override//重写抽象方法
    public void eat() {
        System.out.println("猫吃鱼");
    }
    @Override
    public void sleep() {
        super.sleep();
    }
}
