package case_.this_super关键字;
//    继承格式
//    public class 子类名 extends 父类名{}
//    子类：也称为派生类
//    父类：也称为基类，超类
public class Zi extends Fu {
    public  int height = 178;
    public  int age = 20;

    public void show(){
        int age = 21;
        System.out.println(height);
        System.out.println(age);
//        我要访问本类成员变量age=20,怎么办呢?m
        System.out.println(this.age);
//        我要访问父类的成员变量age=19,怎么办呢?
        System.out.println(super.age);

    }
}
