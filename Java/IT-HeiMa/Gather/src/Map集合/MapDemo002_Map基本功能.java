package Map集合;

import java.util.HashMap;
import java.util.Map;

/*
/*Map集合的基本功能：
          put：添加元素
          remove(Object key)：根据键删除键值对元素元素
          clear：清除所有键值对元素
          containsKey:判断集合中是否包含对应的键
          containsValue:判断集合中是否包含对应的值
          isEmpty:判断集合是否为空
          size：返回集合的键值对个数
Map集合的获取功能：
            get：获取对应键的值
            Set<V> keySet：获取所有键的集合
            Collection<V>values：获取所有值的集合
*/
public class MapDemo002_Map基本功能 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("itheima001", "林青霞");
        map.put("itheima002", "黄洋");
        map.put("itheima003", "王祖贤");
        map.remove("itheima001", "林青霞");
        System.out.println(map.containsKey("itheima001"));
        System.out.println(map.containsValue("黄洋"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.get("itheima003"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        map.clear();
    }
}
