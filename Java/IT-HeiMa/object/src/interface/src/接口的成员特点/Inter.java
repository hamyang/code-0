package 接口的成员特点;

public interface Inter {
    int num = 10;
    int num2 = 20;
//    public static final int num3 = 30;

//    public Inter(){}  //接口里不能有构造方法
//    public void show(){}  //抽象方法不能有非抽象方法

    void method();

    void show();//如果没带前面的public abstract默认有public abstract
}
