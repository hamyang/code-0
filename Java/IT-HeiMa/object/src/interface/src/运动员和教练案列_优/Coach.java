package 运动员和教练案列_优;
//抽象的教练类
public abstract class Coach extends Person {
    public Coach() {
    }
    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}