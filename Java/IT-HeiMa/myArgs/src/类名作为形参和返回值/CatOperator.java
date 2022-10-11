package 类名作为形参和返回值;

public class CatOperator {
    //    类名作为形参其实是该类的对象
    public void useCat(Cat c) {//Cat c = new Cat();
        c.eat();
    }
    public Cat getCat() {
        Cat c = new Cat();
        return c;

    }
}
