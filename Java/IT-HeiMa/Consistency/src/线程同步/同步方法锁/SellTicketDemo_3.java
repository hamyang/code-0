package 线程同步.同步方法锁;

public class SellTicketDemo_3 {
    public static void main(String[] args) {
            Sellticket_3 st = new Sellticket_3();

            Thread t1  = new Thread(st,"窗口1");
            Thread t2  = new Thread(st,"窗口2");
            Thread t3  = new Thread(st,"窗口3");

            t1.start();
            t2.start();
            t3.start();
    }
}
