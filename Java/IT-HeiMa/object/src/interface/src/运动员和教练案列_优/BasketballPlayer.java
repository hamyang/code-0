package 运动员和教练案列_优;
//篮球运动员
public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球");
    }
    @Override
    public void eat() {
        System.out.println("篮球运动员吃肉");
    }
}