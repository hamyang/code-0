package 集合;

import java.util.ArrayList;

public class ArrayList构造和添加 {
    public static void main(String[] args) {
//        public ArrayList():创建一个空的集合对象
//        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        System.out.println(array);
//        public boolean add[E a] :将指定的元素追加到此集合的末尾
//        System.out.println(array.add("hello"));没必要这样，可以直接array.add("内容")；
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);
//-----------------------------------------------
//        public void add(int index,E element):在集合中的指定位置插入指定元素
      array.add(1,"javase");
      System.out.println(array); // 输出[hello, javase, world, java]
//      array.add(4,"javase");//越界
//      System.out.println(array);  集合的索引越界IndexOutOfBoundsException:

    }
}
