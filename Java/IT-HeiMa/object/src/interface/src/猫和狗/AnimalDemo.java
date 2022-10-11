package 猫和狗;

//测试类
public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();//多态

        Animal a = new Cat();
        a.setName("猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
//        a.jump();
        a=new Cat("小猫",4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Cat c= new Cat();
        c.setName("大猫");
        c.setAge(6);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
