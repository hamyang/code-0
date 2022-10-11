package 线程同步.Lock锁;
public class SellTicketDemo_4 {
    public static void main(String[] args) {
        SellTicket_4 st = new SellTicket_4();

        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
