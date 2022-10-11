package 抽象类名作为形参和返回值;

public class AnimalOperator {
    public void useAnimal(Animal a){//Animal a = new Cat();以多态形式
        a.eat();
    }
    public Animal getAnimal(){
        Animal a = new Cat();//有父类引用指向子类对象
        return a;
    }
}

