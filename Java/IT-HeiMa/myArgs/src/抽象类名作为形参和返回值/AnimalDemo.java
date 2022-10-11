package 抽象类名作为形参和返回值;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);
        Animal a2 = ao.getAnimal();// Animal a2=new Cat()
        a2.eat();
    }
}
//总结
//方法的形参是抽象类名，其实需要的是该抽象类的子类对象
//方法的返回值是抽象类名，其实返回的是该抽象的子类对象