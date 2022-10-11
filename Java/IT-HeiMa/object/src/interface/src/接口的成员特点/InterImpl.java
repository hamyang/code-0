package 接口的成员特点;

//public class InterImpl implements Inter{   等价与下一行extends Object为超类
public class InterImpl implements Inter{
    public InterImpl(){
        super();//用的是Object里的构造方法
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
