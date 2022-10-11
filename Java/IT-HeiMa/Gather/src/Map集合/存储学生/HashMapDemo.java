package Map集合.存储学生;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("黄洋", 19);
        Student s3 = new Student("小明", 23);
        Student s4 = new Student("小明", 23);

        hm.put("itheima001", s1);
        hm.put("itheima002", s2);
        hm.put("itheima003", s3);
        hm.put("itheima004", s4);
        //keySet() 方法返回映射中所有 key 组成的 Set 键。
        Set<String> keySet = hm.keySet();

        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}



