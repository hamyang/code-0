package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo003_Map集合遍历1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("itheima001","林青霞");
        map.put("itheima002","黄洋");
        map.put("itheima003","王祖贤");
        //方式一
        for (String i:map.keySet()){//Set<V> keySet：获取所有键的集合
            System.out.println(i+","+map.get(i));//get：获取对应键的值;
        }
        //方式二
        Set<String> keyset = map.keySet();
        for (String key:keyset){
            String value = map.get(key);
            System.out.println(key+","+value);
        }

    }
}
