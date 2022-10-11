package Object类的equals方法_比较两个对象的内容是否相同;

//指示一些其他对象是否等于此
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);

//        需求：比较两个对象的内容是否相同
//        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        /*    public boolean equals(Object obj) {
                this---s1
                obj---s2
                 return (this == obj);
    }*/
    }
}
//总结
//public String toString() 返回对象的字符串表示形式，建议所有子类重写该方法，自动生成
//public String equals(Object obj) 比较对象是否相等，默认比较地址，重写可以比较内容，自动生成