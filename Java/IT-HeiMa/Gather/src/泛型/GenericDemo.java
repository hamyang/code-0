package 泛型;

import java.util.ArrayList;
import java.util.Collection;
//好处
//  把运行时期的问题提前到编译期间
//  避免了强制类型转换
public class GenericDemo {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<>();

        c.add("集合");
        c.add("world");
        c.add("java");

//        c.add(100);//报错：ClassCastException
//        Iterator it=c.iterator();
        for (String s : c) {
//            Object obj = it.next();
//            System.out.println(obj);
//            String s= (String) it.next();
            System.out.println(s);
        }

    }
}
