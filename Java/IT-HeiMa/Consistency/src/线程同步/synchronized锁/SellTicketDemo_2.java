package 线程同步.synchronized锁;

public class SellTicketDemo_2 {
    //出现问题：多次出售相同的票，出现负数
//解决问题：安全问题的解决
//是否多线程环境
//是否共享数据
//是否有多条语句操作共享数据
    public static void main(String[] args) {
        SellTicket_2 st = new SellTicket_2();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}