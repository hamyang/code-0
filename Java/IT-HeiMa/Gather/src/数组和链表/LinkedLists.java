package 数组和链表;

import java.util.LinkedList;
/*数组链表的优缺点：
数组占用空间小，链表元素还要包涵上一元素和下一个元素的的信息
数组的访问速度快，因为内存是连续的
数组内部元素可以随机访问，而链表依赖于上一个元素的信息
---数组查询效率高，链表增，删效率高*/
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> sites = new LinkedList<>();
        sites.add(1);
        sites.add(2);
        sites.add(3);
        sites.add(3);
        System.out.println(sites);
//        使用 addFirst() 在头部添加元素
        sites.addFirst(0);
//        使用 addLast() 在尾部添加元素
        sites.addLast(4);
//        使用 removeFirst() 移除头部元素
        sites.removeFirst();
//        使用 removeLast() 移除尾部元素
        sites.removeLast();
//        使用 getFirst() 获取头部元素
        System.out.println(sites.getFirst());
//        使用 getLast() 获取尾部元素
        System.out.println(sites.getLast());

//        for 配合 size() 方法来迭代列表中的元素
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }
//        for-each 来迭代元素
        for (Integer i : sites) {
            System.out.println(i);
        }

    }
}

