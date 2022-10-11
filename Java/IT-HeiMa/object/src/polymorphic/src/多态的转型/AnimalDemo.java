package 多态的转型;
/*
    向上转型 ：从父到子  父类引用指向子类对象
    向下转型 ：从父到子  父类引用转为子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
//        多态
        Animal a = new Cat();//向上转型，向上赋值
        a.eat();
//        a.playGame();
//        如何使用特有方法a.playGame();呢？

//        创建Cat类的对象就可以了！
/*        Cat c = new Cat();//但是上面已经有了Cat的对象没必要再创一个那怎么办呢？用向下转型就好了！
          c.eat();
          c.playGame();*/

        Cat c = (Cat) a;//向下转型
        c.eat();
        c.playGame();
    }
}
