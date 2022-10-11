package Lambda表达式_省略模式;
import Lambda表达式_抽象方法带参带返回值.Addable;
import Lambda表达式_抽象方法带参无返回值.Flyable;
//1.定义一个接口(Addable),里面定义一个抽象方法:int add(int x,int y);
//2.定义一个测试类(AddableDemo) 在测试类中提供两个方法
//一个方法是:useAddable(Addable a)
//一个方法是主方法：在方法中调用useAddable方法
public class FlyableDemo {
    public static void main(String[] args) {
        // Lambda 表达式的格式 (形式参数)->{代码块}
        /*useAddable((int x, int y) -> {
            return x + y;
        });*/
        //参数的类型可以省略，但是有多个参数的情况下不能只省略一个
        useAddable((x, y) -> {
            return x + y;
        });
        /*useFlyable((s)->{
            System.out.println(s);
        });*/
        //如果参数有且仅有一个，那么小括号可以省略
        useFlyable(s -> {
            System.out.println(s);
        });
        //如果代码块的语句只有一条可以省略大括号和分号，如果有return，return也要省略掉
        useFlyable(s -> System.out.println(s));
        //useAddable((s, y) -> return x + y );
        useAddable((x, y) -> x + y);

    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽");
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
