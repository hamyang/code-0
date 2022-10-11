package case_.this_super关键字;
//测试类
public class Demo {
    public static void main(String[] args) {
//        创建对象，调用方法
        Zi z = new Zi();
//      继承父类后可以调用父类方法
//      方法:方法内部>子类成员位置>父类成员位置
        z.show();
    }
}
