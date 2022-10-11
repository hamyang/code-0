package 增强for循环;

import java.util.ArrayList;
import java.util.List;

//增强for循环：简化数组和Coollection集合的遍历
//实现Iterable接口的类允许其对象成为增强型 for 语句目标
//它是在jdk5之后出现的，其内部原理是一个Iterator迭代器
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("-----");
        String[] strArry = {"集合","world","java"};
        for (String s : strArry) {
            System.out.println(s);
        }
        System.out.println("-----");
        List<String> list = new ArrayList<>();
        list.add("集合");
        list.add("world");
        list.add("java");
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("-----");
//      其内部原理是一个Iterator迭代器
        for (String s:list){
            if (s.equals("world")){
                list.add("javaee");//ConcurrentModificationException
            }
        }
    }
}
