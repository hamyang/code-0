package 抽象类特点;

public abstract class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    @Override
    public void sleep() {
        super.sleep();
    }
}
