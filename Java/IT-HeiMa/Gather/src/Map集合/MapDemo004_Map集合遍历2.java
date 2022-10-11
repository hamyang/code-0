package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//  1.获取所有键值对对象的集合
//      Set<Map.Entry<K,V>> entrySet 获取所有键值对对象的集合
//  2.遍历键值对对象集合，得到每一个键值对对象
//      用增强for循环，得到每一个Map，Entry
//  3.根据键值对对象获取键和值
//      用getKey()得到键
//      用getValue()得到值
public class MapDemo004_Map集合遍历2 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("itheima001","林青霞");
        map.put("itheima002","黄洋");
        map.put("itheima003","王祖贤");
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> me:entries){
        //根据键值对对象获取键和值
            String key=me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }

    }
}
