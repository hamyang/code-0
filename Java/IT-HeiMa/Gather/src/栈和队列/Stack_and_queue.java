package 栈和队列;
/*
优点：
构建一个数组非常简单
查询快，可以在O(1)的时间内根据数组的下标查询某个元素
缺点：
构建时必须分配一段连续的空间
查询某个元素是否存在时需要遍历整个数组，耗费O(n)的时间，n为元素的个数
增删慢，删除和增添某个元素时同样需要耗费O(n)的时间*/
import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_and_queue {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
//      empty()测试栈是否为空
        System.out.println(stack.isEmpty());
//      peek()在不将其从栈中移除的情况下，查看该栈顶部的对象。在栈为空的时候会报EmptyStackException
        System.out.println(stack.peek());
//      pop()删除此栈顶部的对象，并将该对象作为此函数的值返回。在栈为空的时候会报EmptyStackException
        System.out.println(stack.pop());
//      push(E item)将一个项目推送到此堆栈的顶部
        stack.push(5);
        System.out.println(stack);
//      	search(Object o)返回对象在此栈上的从1开始的位置。对象不存在则会返回-1
//        int index = stack.(4);
//        System.out.println(index);

    }
}
