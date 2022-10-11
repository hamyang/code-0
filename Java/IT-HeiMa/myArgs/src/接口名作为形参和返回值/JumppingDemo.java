package 接口名作为形参和返回值;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
//总结
//方法的形参是接口名，其实需要的是该接口的实现类对象
//方法的返回值是接口名，其实返回的是该接口的实现了类对象
