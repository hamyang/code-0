package 可变参数;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

//Arrays工具中有一个静态方法
//      public static <T> List<T> asList (T... a) 返回指定组数支持的固定大小的列表
//List接口中有一个静态方法
//      public static <E> List<E> of (E... elements) 返回包含任意数量元素的不可变列表
//Set接口中有一个静态方法
//      public static <E> Set<E> of (E... elements) 返回一个包含任意数量元素的不可变集合
public class ArgsDemo02 {
    public static void main(String[] args) {
//        //public static <T> List <T> asList(T... a)//返回指定组数支持的固定大小的列表
//        List<String> list = Arrays.asList("集合", "world", "java");
//
//        list.add("javaee"); //UnsupportedOperationException
//        list.remove("world"); //UnsupportedOperationException
//        list.set(1, "javaee");
//
//        System.out.println(list);
//
//        // public static <E> List<E> of (E... elemnts)//返回包含任意数量元素的不可变列表
//        List<String> list = List.of("集合", "world","java","world");
//
//          list.add("javaee");//UnsupportedOperationExcept
//          list.remove("java");//UnsupportedOperationExcept
//          list.set(1,"javaee");//UnsupportedOperationException
//
//        System.out.println(list);
//
//        //public static <E> Set<E> of (E.. elements)//返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("集合", "world", "java", "world"); //IllegalArgumentException
//        Set<String> set = Set.of("集合", "world","java");
//
//        set.add("javaee ");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException
//
//        System.out.println(set);

    }
}
