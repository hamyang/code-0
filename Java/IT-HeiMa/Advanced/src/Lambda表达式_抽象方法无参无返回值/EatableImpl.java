package Lambda表达式_抽象方法无参无返回值;

public class EatableImpl implements Eatable{
    @Override
    public void eat() {
        System.out.println("亲爱的主人让你久等了！");
    }
}
