package 状态修饰符.final修饰符;
public class Fu {
    public final void method(){
        System.out.println("Fu method");
    }
    /*    c.
public final class Fu { //Fu被final修饰Fu就是最终类，就不可能有子类
    public final void method(){
        System.out.println("Fu method");
    }*/
}
//总结
//a.方法被final修饰,表名方法是最终方法，不能被重写
//b.变量被final修饰,表名该变量是常量，不能被再次赋值
//c.类被final修饰,表名该类是最终类，不能被继承