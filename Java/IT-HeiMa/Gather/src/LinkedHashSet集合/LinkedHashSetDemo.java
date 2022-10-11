package LinkedHashSet集合;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("集合");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
//        linkedHashSet.add("集合");不可重复
        for (String s :linkedHashSet){
            System.out.println(s);
        }
    }
}
