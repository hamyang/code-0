package 猫和狗_多态版;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();//采用多态形式
        a.setName("猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("小猫",3);
        System.out.println();
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
