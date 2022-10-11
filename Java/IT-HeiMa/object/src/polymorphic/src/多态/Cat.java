package 多态;
//      有继承
public class Cat extends Animal{
//    有方法重写
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}