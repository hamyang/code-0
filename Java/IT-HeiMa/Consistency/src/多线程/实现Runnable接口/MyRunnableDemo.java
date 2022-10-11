package 多线程.实现Runnable接口;

//方式二:实现Runnable接口
//1.定义一个类MyRunnable实现Runnable
//2.在MyRunnable类中重写run()方法
//3.创建MyRunnable类对象
//4.创建Thread类的对象，把MyRunnable对象作为构造方法的参数
//5.启动线程
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        //Thread t1 = new Thread(my);
        //Thread t2 = new Thread(my);
        Thread t1 = new Thread(my, "高铁");
        Thread t2 = new Thread(my, "飞机");
        t1.start();
        t2.start();
    }
}