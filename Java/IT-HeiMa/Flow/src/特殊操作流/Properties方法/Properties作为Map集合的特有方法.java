package 特殊操作流.Properties方法;

import java.util.Properties;
import java.util.Set;

//Object setProperty(String key, String value)	设置集合的键和值，都是String类型，底层调用 Hashtable方法 put
//String getProperty(String key)	使用此属性列表中指定的键搜索属性
//Set<String> stringPropertyNames()	从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
public class Properties作为Map集合的特有方法 {
    public static void main(String[] args) {
        Properties Prop = new Properties();
        Prop.setProperty("itheima001", "林青霞");//Object setProperty(String key, String value)	设置集合的键和值，都是String类型，底层调用 Hashtable方法 put
        Prop.setProperty("itheima002", "黄洋");
        Prop.setProperty("itheima003", "张曼玉");
        System.out.println(Prop);
        System.out.println(Prop.getProperty("itheima001"));//String getProperty(String key)	使用此属性列表中指定的键搜索属性
        Set<String> names = Prop.stringPropertyNames();//Set<String> stringPropertyNames()	从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串,也就返回所有是键值
        for (String key : names) {
            String value = Prop.getProperty(key);
            System.out.println(key + "," + value);
        }

    }
}
