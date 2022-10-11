package Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Iterator:迭代器,集合的专用遍历方式
//Iterator<E> iterator():返回此集合中元素的迭代器,通过集合的iterator()方法得到
//迭代器是通过集合的iterator()方法得到的,所以我们说他是依赖于集合而存在的
//Iterator中的常用方法
//E next():返回迭代中的下一个元素
//boolean hasNext():如果迭代具有更多的元素,则返回true
public class Iterator迭代器 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();

        //添加元素
        c.add("集合");
        c.add("world");
        c.add("java");
        //遍历集合先得到集合的迭代器
        //Iterator<E> iterator():返回此集合中元素的迭代器,通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();
        //E next():返回迭代中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        //System.out.println(it.next());//存在越界异常问题
        //使用下面方法解决
        //boolean hasNext():如果迭代具有更多的元素,则返回true
        if (it.hasNext()) {
            System.out.println(it.next());
        }
        //用while循环改进
        while (it.hasNext()) {
            //System.out.println(it.next());
            //有可能还要进行其他操作,改进下面方法
            String s = it.next();
            System.out.println(s);
        }
    }
}