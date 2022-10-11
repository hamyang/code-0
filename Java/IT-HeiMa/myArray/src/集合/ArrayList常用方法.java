package 集合;
/*
    ArrayList常用方法：
        public boolean remove(object o):删除指定元素，返回删除是否成功
        public E remove(int index):删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        public E get(int index):返回指定索引处的元素
        public int size：返回集合中的元素的个数
*/

import java.util.ArrayList;

public class ArrayList常用方法 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

//        public boolean remove(object o):删除指定元素，返回删除是否成功
        System.out.println(array.remove("world"));//也可以array.remove("world");
        System.out.println(array);
        System.out.println(array.remove("aaaa"));//返回false
        System.out.println(array);
//      ------------------------------------

//        public E remove(int index):删除指定索引处的元素，返回被删除的元素
/*      System.out.println(array.remove(1));
        System.out.println(array);*/
//      ----------------------------------

//        public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
/*      System.out.println(array.set(1,"javaee"));
        System.out.println(array);*/
//      --------------------------------------
//         public E get(int index):返回指定索引处的元素
/*      System.out.println(array.get(0));
        System.out.println(array);*/
//      -----------------------------------------
//        public int size：返回集合中的元素的个数
/*      System.out.println(array.size());
        System.out.println(array);*/
//      -----------------------------------------
    }
}
