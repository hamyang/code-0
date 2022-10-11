package 成员访问特点;

public class Cat extends Animal{
    public int age = 101;
    public int weight = 10;
    @Override//方法重写
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
