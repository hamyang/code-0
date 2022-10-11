package 多态的好出和弊端;
//动物操作类
public class AnimalOperator {
/*    public void useAnimal(Cat c){//相当于Cat c = new Cat();
        c.eat();
    }public void useAnimal(Dog d){//相当于Dog d = new Dog();
        d.eat();
    }*/
//修改
    public void useAnimal(Animal a){
//        Animal a = new cat();
//        Animal a = new Dog();
        a.eat();

//        a.lookDoor();   弊端：多态的形式不能访问具体的子类所特有的功能
    }
}
//总结
//多态好处：提高了程序的扩展性
//    体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
//多态弊端：不能使用子类的特有功能    --使用多态的转型可实现特有