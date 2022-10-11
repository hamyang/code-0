package 方法重写;
/*测试类*/
public class phoneDemo {
    public static void main(String[] args) {
//        创建对象,构造方法
     phone p = new phone();
     p.call("林青霞");
     System.out.println("--------");

     Newphone np = new Newphone();
     np.call("林青霞");
    }
}
