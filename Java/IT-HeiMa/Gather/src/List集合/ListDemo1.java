package List集合;

import java.util.ArrayList;
import java.util.List;

//List集合特有方法:
//void add(int index,E element):在此集合中的指定位置插入指定元素
//E remove(int index):删除指定索引处的元素,返回被删除的元素
//E set(int index,E element):修改指定索引处的元素,返回被修改的元素
//E get(int index):返回指定索引处的元素
//List 集合特点
//有序:存储和取出的元素顺序一致
//可重复:存储的元素可以重复
public class ListDemo1 {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> List = new ArrayList<>();
        //添加元素
        List.add("集合");
        List.add("world");
        List.add("java");
        List.add("java");
        //void add(int index,E element):在此集合中的指定位置插入指定元素
        List.add(2, "插入数据");
        //E set(int index,E element):修改指定索引处的元素,返回被修改的元素
        List.set(2, "修改后元素");
        //E get(int index):返回指定索引处的元素
        System.out.println(List.get(2));
        //E remove(int index):删除指定索引处的元素,返回被删除的元素
        System.out.println(List.remove(2));
        // 输出集合对象
        System.out.println(List);
        //迭代器的方式遍历
        for (String s : List) {
            System.out.println(s);
        }
        System.out.println("------------");
        //因为E get(int index):返回指定索引处的元素  的存在
        //for循环改进遍历
        for (String s : List) {
            System.out.println(s);
        }
    }
}
