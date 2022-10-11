package 状态修饰符.final修饰符;

public class Zi extends Fu {
    //    @Override   a.
//    被final修饰的方法为最终方法，最终方法是不能重写的
//    public void method(){
//        System.out.println("Zi method");
//    }
    public final int age = 20;//被final修饰age为常量不能再被修改
    public void show(){
//        age = 100;        b.  被final修饰age为常量不能再被修改
        System.out.println(age);
    }

}
