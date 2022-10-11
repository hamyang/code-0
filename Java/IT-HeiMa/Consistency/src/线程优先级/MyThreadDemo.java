package 线程优先级;
//设置优先级方法
//public final void setPriority(int newPriority) :更改此线程的优先级
//public final int getPriority():返回此此线程的优先级
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread tp1 = new MyThread();
        MyThread tp2 = new MyThread();
        MyThread tp3 = new MyThread();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");
        //public final int getPriority():返回此此线程的优先级
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());
        //public final void setPriority(int newPriority) :更改此线程的优先级
/*
   System.out.println(Thread.MIN_PRIORITY);//最高10
   System.out.println(Thread.MAX_PRIORITY);//最低1
   System.out.println(Thread.NORM_PRIORITY);//默认5
*/
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
