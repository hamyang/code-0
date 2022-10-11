package Map集合.集合嵌套ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListandHashSetDemo {
    public static void main(String[] args) {
        //创建HoshMap集合，并添加键值对元素
        ArrayList<HashMap<String, String>> array = new ArrayList<>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("孙策", "大桥");
        hm1.put("周瑜", "小乔");
        //把HashMap作为元素添加到ArrayList集合
        array.add(hm1);
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        //把HashMap作为元素添加到ArrayList集合
        array.add(hm2);
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        array.add(hm3);
        //遍历ArrayList集合
        for (HashMap<String, String> hm : array) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}