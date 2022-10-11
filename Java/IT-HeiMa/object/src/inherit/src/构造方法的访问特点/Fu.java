package 构造方法的访问特点;

public class Fu {
/*    public Fu(){
        System.out.println("Fu中无参构造方法被调用");
    }*/
    public Fu(){} //b：手动给出无参构造方法
    public Fu(int age){
        System.out.println(age);
        System.out.println("Fu中带参构造方法被调用");
    }
}
