package 线程安全类;

import java.util.*;

public class 线程安全类 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();//线程安全.存在同步方法
        StringBuilder sb2 = new StringBuilder();//线程不安全

        Vector<String> v= new Vector<>();//线程安全
        ArrayList<String> array = new ArrayList<>();//线程不安全

        Hashtable<String,String> ht = new Hashtable<>();//线程安全
        HashMap<String,String> hm = new HashMap<>();//线程不安全

//        static <T> list<T> synchronizedlist (list<T> list) 返回指定列表支持同步(线程安全列表)
        List<String> list = Collections.synchronizedList(new ArrayList<String>());//包装成线程安全类
    }
}
