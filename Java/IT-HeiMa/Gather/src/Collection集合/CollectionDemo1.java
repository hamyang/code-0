package Collection集合;

import java.util.ArrayList;
import java.util.Collection;

//创建CollectionDemo1集合对象
//以多态方式创建
//ArrayList()
public class CollectionDemo1 {
    public static void main(String[] args) {
//创建CollectionDemo1集合对象,多态方式
        Collection<String> c = new ArrayList<>();

        //添加元素： Boolean add(E e)
        c.add("集合");
        c.add("world");
        c.add("java");
        //输出集合对象
        System.out.println(c);
    }
}
