package 成员方法的访问特点;

public class Zi extends Fu{
    public void method(){
        System.out.println("Zi中method()方法被调用");
    }
    public void show(){
        super.show();
        System.out.println("zi中show方法被调用");
    }
}
