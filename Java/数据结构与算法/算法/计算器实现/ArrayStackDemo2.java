package 计算器实现;

public class ArrayStackDemo2 {
    public static void main(String[] args) {
        String expression = "3+2*6-2";
        // 存放数字
        ArrayStack2 numStack = new ArrayStack2(10);
        // 存放符号
        ArrayStack2 operStack = new ArrayStack2(10);
        // 用于扫描
        int index = 0;
        int num1;
        int num2;
        int oper;
        int res ;
        String keepNum = "";
        while (true) {
            // 依次得到experssion 的每一个字符
            char ch = expression.substring(index, index + 1).charAt(0);
            // 判断ch 是什么然后相应处理
            // 如果是运算符
            if (operStack.isOpen(ch)) {
                // 判断当前符号栈是否为空
                if (!operStack.isEmpty()) {
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        // 把运算结果存入数栈
                        numStack.push(res);
                        // 把当前的操作符入符号栈
                        operStack.push(ch);
                    } else {
                        // 如果当前操作符大于栈中的操作符，直接入符号栈
                        operStack.push(ch);
                    }
                } else {
                    // 如果为空直接入栈
                    operStack.push(ch);
                }
            } else {
                // 如果是数字
                // 当处理多位数时，不能发现一个数就立即入栈，可能是多位数
                keepNum += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    //只是看后一位，不是indes++
                    if (operStack.isOpen(expression.substring(index + 1, index + 2).charAt(0))) {
                        //如果后一位是运算符
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            // 让index +1 并判断是否扫描到expression最后
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        // 当扫描完毕，就顺序从数字和符号栈中pop出相应的数字和符号，并运行
        while (!operStack.isEmpty()) {
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        int res2 = numStack.pop();
        System.out.printf("表达式%s = %d", expression, res2);
    }
}


class ArrayStack2 {
    // 栈的大小
    private final int maxSize;
    // 数组模拟栈
    private final int[] stack;
    // top表示栈顶，初始值为-1
    private int top = -1;

    // 构造器
    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        // 初始化
        stack = new int[this.maxSize];
    }

    // 返回栈顶的值，不是真正的pop
    public int peek() {
        return stack[top];
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
        // 先判断栈是否 为空
        if (isEmpty()) {
            // 抛出异常
            throw new RuntimeException("栈空");
        }
        top--;
        return stack[top];
    }

    // 返回运算符优先级，使用数字表示，数字越大优先级越高
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        }
        if (oper == '+' || oper == '-') {
            return 0;
        } else {
            // 假定当前表达式只有加减乘除
            return -1;
        }
    }

    // 判断是不是一个运算符
    public boolean isOpen(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    // 计算方法
    public int cal(int num1, int num2, int oper) {
        // 用于存放计算结果
        int res = 0;
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }
}
