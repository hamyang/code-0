package 构造方法的访问特点;

public class Zi extends Fu{
    public Zi(){        //规则:字类中的所有的构造方法默认都会访问父类中的无参构造方法
//        super();      fu的无参构造方法被注释就用下面方法访问带参构造方法
        super(20);//a：直接访问fu类的带参构造方法
        System.out.println("zi中无参构造方法被调用");
    }
    public Zi(int age){
//        super();
        super(30);//a：
        System.out.println("zi中带参构造方法被调用");
    }
}
