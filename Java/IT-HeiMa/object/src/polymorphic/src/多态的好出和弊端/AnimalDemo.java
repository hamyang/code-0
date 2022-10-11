package 多态的好出和弊端;

public class AnimalDemo {
    public static void main(String[] args) {
//        创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);//c相当于new Cat();

        Dog d = new Dog();
        ao.useAnimal(d);//d相当于new Dog();
        d.lookDoor();

        pig p = new pig();
        ao.useAnimal(p);//p相当于new pig();
    }
}