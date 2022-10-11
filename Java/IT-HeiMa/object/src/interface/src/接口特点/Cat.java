package 接口特点;

public class Cat implements Jumpping{//类实现接口不能用exdents
    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }
}
