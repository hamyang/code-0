package 线程同步.卖票_1;
//100张票3个窗口
public class SellTicketDemo_1 {
    public static void main(String[] args) {
        SellTicket_1 st = new SellTicket_1();
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
