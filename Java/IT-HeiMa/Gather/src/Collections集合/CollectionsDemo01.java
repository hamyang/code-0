package Collections集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections 类是 Java 提供的一个操作 Set、List 和 Map 等集合的工具类。
Collections 类提供了许多操作集合的静态方法，借助这些静态方法可以实现集合元素的排序、查找替换和复制等操作
* */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        Collections.swap(list, 0, 1);//static void swap(List list, int i, int j) :将指定列表中的两个索引进行位置互换
        System.out.println(list);
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
    }

    private static void method1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        Collections.sort(list);//static void  sort(List<T> list) :按照列表中元素的自然顺序进行排序
        System.out.println("自然排序"+list);
    }

    private static void method2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.shuffle(list);//static void shuffle(List list)  :随机置换
        System.out.println("随机置换"+list);
    }

    private static void method3() {
        //static void reverse(List list)  :反转
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Collections.reverse(list);
        System.out.println("反转"+list);
    }

    private static void method4() {
        List<String> list = new ArrayList<>();
        list.add("集合");
        list.add("world");
        list.add("java");
        System.out.println(list);
        Collections.fill(list, "android");//static void fill(List list, Object obj) :使用指定的对象填充指定列表的所有元素
        System.out.println("填充所有元素"+list);
    }

    private static void method5() {
        //创建源列表
        List<String> src = new ArrayList<>();
        src.add("集合");
        src.add("world");
        src.add("java");

        //创建目标列表
        List<String> dest = new ArrayList<>();
        dest.add("java");
        dest.add("java");
        dest.add("java");
        Collections.copy(dest, src);//static void copy(List dest, List src) :是把源列表中的数据覆盖到目标列表
        //注意：目标列表的长度至少等于源列表的长度，不然会报错

        System.out.println("覆盖到目标列表"+dest);
    }

    private static void method6() {
        //static int  binarySearch(List list, Object key) 使用二分查找法查找指定元素在指定列表的索引位置
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int index = Collections.binarySearch(list, 3);
        System.out.println("二分法查找"+index);
    }
}

