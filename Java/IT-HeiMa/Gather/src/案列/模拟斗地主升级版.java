package 案列;

import java.util.*;

public class 模拟斗地主升级版 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        String[] colors = {"♣", "♥", "♦", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
//        洗牌
        Collections.shuffle(array);
//        发牌使用TreeSet集合自然排序
        TreeSet<Integer> 林青霞Set = new TreeSet<>();
        TreeSet<Integer> 黄洋Set = new TreeSet<>();
        TreeSet<Integer> 风清扬Set = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();


        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                林青霞Set.add(x);
            } else if (i % 3 == 1) {
                黄洋Set.add(x);
            } else if (i % 3 == 2) {
                风清扬Set.add(x);
            }
        }
        lookpoker("林青霞",林青霞Set,hm);
        lookpoker("林青霞",黄洋Set,hm);
        lookpoker("林青霞",风清扬Set,hm);
    }
//    定义方法遍历集合
public static void lookpoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
    System.out.print(name+"的牌是");
    for (Integer key:ts){
        String poker = hm.get(key);
        System.out.print(poker+" ");
    }
    System.out.println();
}
}
