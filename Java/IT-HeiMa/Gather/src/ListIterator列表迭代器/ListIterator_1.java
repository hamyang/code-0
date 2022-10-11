package ListIterator列表迭代器;
//ListIterator:列表迭代器
//通过List集合的ListIterator()方法得到，所以说它是List集合特有的迭代器
//用于允许程序员延任意方向遍历列表的迭代器。在迭代期间修改列表，并获取列表中的迭代器的当前位置

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ListIterator的常用方法：
//E next():返回迭代中的下一个元素
//boolean hasNext():如果迭代具有更多元素，则返回true
//E previous():返回列表中的上一个元素
//boolean hasprevious():如果此列表迭代器在相反方向遍历是具有更多元素，则返回true
//void add(E e):将指定元素插入列表
public class ListIterator_1 {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("集合");
        list.add("world");
        list.add("java");
        //通过List集合的ListIterator()方法得到
        ListIterator<String> lit = list.listIterator();
        // E next():返回迭代中的下一个元素
        //正向遍历 boolean hasNext():如果迭代具有更多元素，则返回true
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("-------");
        //逆向遍历 E previous():返回列表中的上一个元素
        //boolean hasprevious():如果此列表迭代器在相反方向遍历是具有更多元素，则返回true
        while (lit.hasPrevious()) {
            String s1 = lit.previous();
            System.out.println(s1);
        }
        //void add(E e):将指定元素插入列表
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                lit.add("javaee");
            }
        }
        System.out.println(list);

    }
}
