package set集合;
//set集合特点
//      不包含重复元素集合
//      没有带索引的方法,所以不能使用普通for循环遍历

import java.util.HashSet;
import java.util.Set;

//      HashSet:对集合的迭代顺序不做任何保证
public class setDemo {
    public static void main(String[] args) {
//        创建集合对象
        Set<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
//        添加元素
        set.add("集合");
        set.add("world");
        set.add("java");
//        遍历
        for (String s:set){
            System.out.println(s);
        }

    }
}
