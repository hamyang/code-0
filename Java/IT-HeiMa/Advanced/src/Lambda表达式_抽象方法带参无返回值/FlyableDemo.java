package Lambda表达式_抽象方法带参无返回值;

// Lambda 表达式的格式 (形式参数)->{代码块}
//1.定义一个接口(Flyable),里面定义一个抽象方法:void fly(String s);
//2.定义一个测试类(FlyableDemo) 在测试类中提供两个方法
//一个方法是:useFlyable(Flyable f)
//一个方法是主方法：在方法中调用useFlyable方法
public class FlyableDemo {
    public static void main(String[] args) {


//匿名内部类格式
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.print(s);
                System.out.println("晴空万里");
            }
        });


//Lambda 表达式的格式 (形式参数)->{代码块}
        useFlyable((String s) -> {
            System.out.print(s);
            System.out.println("你好Java");
        });
    }


    private static void useFlyable(Flyable f) {
        f.fly("风和日丽");
    }
}
