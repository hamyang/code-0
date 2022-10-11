package 多态的好出和弊端;

public class Dog extends Animal implements dog_jk{
    @Override
    public void eat() {
        System.out.print("狗吃骨头  ");
    }

    @Override
    public void lookDoor() {
        dog_jk.super.lookDoor();
    }
}