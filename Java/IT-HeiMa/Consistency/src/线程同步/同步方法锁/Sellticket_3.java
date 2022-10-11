package 线程同步.同步方法锁;

//同步方法的锁对象是This
//同步静态方法锁
public class Sellticket_3 implements Runnable {
    //    private int tickets = 100;
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                //synchronized (obj) {
                //synchronized (this) {//同步方法的锁
                synchronized (Sellticket_3.class) {//同步静态的锁
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
/*
        synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
                */
                sellTicet();
            }
            x++;
        }
    }

    /*
         private void sellTicet() {
                 synchronized (obj) {
                     if (tickets > 0) {
                         try {
                             Thread.sleep(100);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                         System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                         tickets--;
                     }
                 }
             }
        */
        /*
          private synchronized void sellTicet() {
                {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            }
            */
    private static synchronized void sellTicet() {
        {
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
