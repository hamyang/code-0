package Map集合;

import java.util.HashMap;
import java.util.Map;
//Map集合概述
        //Interface Map<K<V> K:建的类型  V:值的类型
        //将建映射到值的对象，不能包含重复的建，每个键可以映射到最多一个值
        //如： itheima001   林青霞
        //    itheima002   黄洋
        //创建Map集合的对象
        //具体的实现类HashMap
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();//HashMap保证建的唯一性
        //添加元素
        map.put("itheima001","林青霞");
        map.put("itheima002","黄洋");
        map.put("itheima003","王祖贤");
        System.out.println(map);
    }
}
