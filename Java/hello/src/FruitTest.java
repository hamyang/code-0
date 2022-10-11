//父类水果类
abstract class Fruit {
    private double weight;// 重量
    private double hantangliang; //含糖量，如0.8
    //0、写出重量属性的get和set方法
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHantangliang() {
        return hantangliang;
    }

    public void setHantangliang(double hantangliang) {
        this.hantangliang = hantangliang;
    }

    public Fruit(double weight, double hantangliang) {
        this.weight = weight;
        this.hantangliang = hantangliang;
    }

    //1在这儿填写一个抽象方法 MakeFruit()
    abstract void MakeFruit();
}

//2编写一个子类“Banana”，重写MakeFruit()， 输出“结出一个香蕉”
class Banana extends Fruit {
    public Banana() {
        super(54.6,0.8);
    }
    @Override
    void MakeFruit() {
        System.out.println("香蕉");
    }

}

//3编写一个子类“Apple”，重写MakeFruit()， 输出“结出一个苹果”；苹果增加一个属性“颜色”,写出苹果的构造函数， 并在其中调用父类构造方法。
class Apple extends Fruit {
    public Apple() {
        super(93.4,0.6);
    }

    public Apple(double weight, double hantangliang) {
        super(weight, hantangliang);
        Colour();
    }
    @Override
    void MakeFruit() {
        System.out.println("苹果");
    }
    private void Colour(){
        System.out.println("红色");
        Apple apple = new Apple();
        apple.MakeFruit();
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Banana b = new Banana();
        b.MakeFruit();
        //4用多态的方式调用Apple类的 MakeFruit()方法
        Fruit a = new Apple();
        a.MakeFruit();
    }
}
