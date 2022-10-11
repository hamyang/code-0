import java.util.Scanner;

public class 栈 {
    public static void main(String[] args) {
        // 创建对象
        ArrayStack stack = new ArrayStack(4);
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("show:显示栈");
            System.out.println("exit:退出程序");
            System.out.println("push:添加数据到栈");
            System.out.println("pop:从栈中取出数据");
            System.out.println("请输入您的选择");
            String key = scanner.next();
            switch (key) {
                case "show":
                    stack.list();
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try {
                        int res = stack.pop();
                        System.out.println(res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

class ArrayStack {
    // 栈的大小
    private int maxSize;
    // 数组模拟栈
    private int[] stack;
    // top表示栈顶，初始值为-1
    private int top = -1;

    // 构造器
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        // 初始化
        stack = new int[this.maxSize];
    }

    // 栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // 栈空
    public boolean isEmpty() {
        return top == -1;
    }

    // 入栈
    public void push(int value) {
        // 先判断栈是否满
        if (isFull()) {
            System.out.println("栈已满");
            return;
        }
        top++;
        stack[top] = value;
    }

    // 出栈，将栈顶的数据返回
    public int pop() {
        // 先判断栈是否 为kong
        if (isEmpty()) {
            // 抛出异常
            throw new RuntimeException("栈空");
        }
        top--;
        return stack[top];
    }

    // 遍历栈，需要从栈顶开始显示
    public void list() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(i + ":" +"["+ stack[i]+"]");
        }
    }

}

