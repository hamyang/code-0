package 多态;
/*
    多态:同一个对象，再不同时刻变现出来的不同形态
    举列：猫
        我们可以说猫是猫 cat = new cat()
        我们也可以说猫是动物：animal = new cat()
        这里猫再不同时刻表现出来了不同的形态，这就是多态

        多态前提和体现
            有继承/实现关系
            有方法重写
            有父类引用指向子类对象
*/
public class AnimalDemo {
    public static void main(String[] args) {
//        有父类引用指向子类对象
        Animal a = new Cat();
        a.eat();
    }
}