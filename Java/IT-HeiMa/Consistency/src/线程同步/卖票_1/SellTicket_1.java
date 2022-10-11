package 线程同步.卖票_1;

import java.util.concurrent.locks.Lock;

public class SellTicket_1 implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
            if (tickets<=0){
                System.out.println("票没了");
                System.exit(1);
            }
        }
    }
}
