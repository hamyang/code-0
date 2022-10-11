package 计算器实现;

import java.util.*;

public class PolandNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        List<String> list1 = toInfixExpressionList(str);
        System.out.println("中缀表达式" + list1);
        List<String> suffixExpression = parseSuffixExpreeionList(list1);
        System.out.println("后缀表达式" + suffixExpression);
        int res = calculate(suffixExpression);
        System.out.println("结果是=" + res);
    }

    public static List<String> getListString(String suffixExpression) {
        // 分割
        String[] split = suffixExpression.split(",");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, split);
        return list;
    }

    public static int calculate(List<String> ls) {
        // 创建栈
        Stack<String> stack = new Stack<>();
        for (String item : ls) {
            // 用正则表达式来取出数
            if (item.matches("\\d+")) {
                stack.push(item);
            } else {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                stack.push(res + "");
            }
        }
        // 最后为结果
        return Integer.parseInt(stack.pop());
    }

    // 中缀表达式转成对应的List
    public static List<String> toInfixExpressionList(String s) {
        List<String> ls = new ArrayList<>();
        int i = 0;
        String str;
        char c;
        do {
            if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57) {
                ls.add("" + c);
                i++;
            } else {
                str = "";
                while (i < s.length() && (c = s.charAt(i)) >= 48 && (c = s.charAt(i)) <= 57) {
                    // 拼接
                    str += c;
                    i++;
                }
                ls.add(str);
            }
        } while (i < s.length());
        return ls;
    }

    // 将得到的中缀表达式对应的List转换为后缀表达式
    public static List<String> parseSuffixExpreeionList(List<String> ls) {
        //定义两个栈
        Stack<String> s1 = new Stack<>(); // 符号栈
        List<String> s2 = new ArrayList<>();// 结果
        // 遍历ls
        for (String item : ls) {
            if (item.matches("\\d+")) {
                s2.add(item);
            } else if (item.equals("(")) {
                s1.push(item);
            } else if (item.equals(")")) {
                while (!s1.peek().equals("(")) {
                    s2.add(s1.pop());
                }
                s1.pop(); // 将（弹s1栈，消除小括号
            } else {
                while (s1.size() != 0 && Operation.getValue(s1.peek()) >= Operation.getValue(item)) {
                    s2.add(s1.pop());
                }
                // 还要将item压入
                s1.push(item);
            }
        }
        // 将s1中剩余的运算符依次弹出并加入s2
        while (s1.size() != 0) {
            s2.add(s1.pop());
        }
        return s2;
    }
}

class Operation {
    private static final int ADD = 1;
    private static final int SUB = 1;
    private static final int MUL = 2;
    private static final int DIV = 2;

    // 写一个方法返回对应的优先级数字
    public static int getValue(String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                return ADD;
            case "-":
                return SUB;
            case "*":
                return MUL;
            case "/":
                return DIV;
            default:
                System.out.println("不存在该运算符");
        }
        return result;
    }
}
