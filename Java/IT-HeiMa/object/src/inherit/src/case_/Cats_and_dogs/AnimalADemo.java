package case_.Cats_and_dogs;

public class AnimalADemo {
    public static void main(String[] args) {
//        无参
        Cat c1=new Cat();
        c1.setName("花猫");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge()+"岁了");
        Dog d1=new Dog();
        d1.setName("小狗");
        d1.setAge(7);
        System.out.println(d1.getName()+","+d1.getAge()+"岁了");
        c1.catchMouse();
        d1.lookDoor();
//        带参
        Cat c2=new Cat("黑猫",3);
        System.out.println(c2.getName()+","+c2.getAge()+"岁了");
        Dog d2 = new Dog("大狗",9);
        System.out.println(d2.getName()+","+d2.getAge()+"岁了");
        c2.catchMouse();
        d2.lookDoor();

    }

}
