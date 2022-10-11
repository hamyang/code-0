package Collection集合;

import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo2 {
    public static void main(String[] args) {
//        创建集合对象
        Collection<String> c=new ArrayList<>();
//  boolean add(E e):添加元素,可存相同元素
        c.add("集合");
        c.add("world");
        c.add("world");
        c.add("java");
        System.out.println(c.add("添加sout输出语句才可以返回对元素操作的情况"));
//  boolean remove(Object O):从集合中移除指定元素
        c.remove("world");
//        boolean contains(Object O):判断集合中是否存在指定的元素
        System.out.println(c.contains("集合"));
//       int size():集合的长度,也就是集合中的元素个数
        System.out.println(c.size());
//        void clear():清空集合中的元素
        c.clear();
//       boolean isEmpty();判断集合中元素是否为空
        System.out.println(c.isEmpty());
//        输出集合对象
        System.out.println(c);
    }
}



