package 特殊操作流.Properties方法;

import java.util.Properties;
import java.util.Set;

public class Properties作为Map集合的使用 {
    public static void main(String[] args) {
        //Properties<String,String> prop = new Properties<String,String>();//没有泛型
        Properties prop = new Properties();
        prop.put("itheima001", "林青霞");
        prop.put("itheima002", "黄洋");
        prop.put("itheima003", "张曼玉");

        Set<Object> keySet = prop.keySet();//keySet() 方法可以与 for-each 循环一起使用，用来遍历迭代 HashMap 中的所有键。
        for (Object key : keySet) {
            Object value = prop.get(key);//String getProperty(String key)	使用此属性列表中指定的键搜索属性
            System.out.println(key + "," + value);
        }

    }
}
