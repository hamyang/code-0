package 线程同步.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//void lock(): 获得锁
//void unlock(): 释放锁
//lock是接口不能直接实列化,这里采用它的实现了ReentrantLock来实列化
public class SellTicket_4 implements Runnable {
    private int tickets = 10000;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//加锁
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();//释放锁
            }
        }
    }
}
