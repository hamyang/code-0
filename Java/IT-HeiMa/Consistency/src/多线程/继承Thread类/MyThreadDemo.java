package 多线程.继承Thread类;

//void setName(String name) 将此线程的名称跟改为等于参数name
//getName(): 返回此线程名称
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建MyThread对象
        //设置线程名称，
        //带参构造
        MyThread my1 = new MyThread("高铁");
        MyThread my2 = new MyThread("飞机");
        MyThread my3 = new MyThread("汽车");
        //启动线程
        //my1.run(); run方法的调用并没有启动线程
        //void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法。
        my1.start();
        my2.start();
        my3.start();
        //static Thread currentThread() 返回当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());//在一个main的线程中执行的
    }
}
