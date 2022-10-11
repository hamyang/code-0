import java.util.Scanner;

public class 队列 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        char key;//接收用户输入
        Scanner scanner = null;
        scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s.(show):显示队列");
            System.out.println("e.(exit):退出程序");
            System.out.println("a.(add):添加数据到队列");
            System.out.println("g.(get):从队列取出数据");
            System.out.println("h.(heat):查看队列头的数据");

            key = scanner.next().charAt(0);//接收一个字符
            try {
                switch (key) {
                    case 's':
                        queue.showQueue();
                        break;
                    case 'a':
                        System.out.println("输入一个数");
                        int value = 0;
                        try {
                            value = scanner.nextInt();
                            queue.addQueue(value);
                        } catch (Exception e) {
                            System.out.println("!!!请输入数字");
                        }
                        break;
                    case 'g':
                        try {
                            int res = queue.getQueue();
                            System.out.println("取出的数据是:" + res);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 'h':
                        try {
                            int res = queue.headQueue();
                            System.out.println("队列头的数据是:" + res);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 'e':
                        scanner.close();//关闭输入，否则会出现异常
                        loop = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("输入有误!!!请输入数字");
            }
        }
        System.out.println("程序退出");
    }
}

class ArrayQueue {
    private int maxSize;//表示队列的最大容量
    private int rear;//队列尾
    private int front;//队列头
    private int[] arr;//用于存放数据，模拟队列

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    //判断队列是否满
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        //判断队列是否满
        if (isFull()) {
            System.out.println("队列已满，不能加入数据");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    //获取队列的数据，出队列
    public int getQueue() {
        //判断队列是否空
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能读取数据");
        }
        front++;
        return arr[front];
    }

    //显示队列所有数据
    public void showQueue() {
        //遍历
        if (isEmpty()) {
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array" + i + "=" + arr[i]);
        }
    }

    //显示队列的 头数据，不是取出数据
    public int headQueue() {
        //判断
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front + 1];
    }
}

//使用数组模拟队列编写一个ArrayQueue类
