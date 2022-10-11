package set集合;
//哈希值:是JDK根据对象的地址或字符串或数字算int类型的数值
//Object类中有一个方法可以获得哈希值
//  public int hashCode():返回对象的哈希值
public class HashDemo {
    public static void main(String[] args) {
//        创建学生对象
        Student s1=  new Student("林青霞",30);
//        同一个对象多次调用hashCode():方法返回的哈希值是相同的
        System.out.println(s1.hashCode());//460141958
        System.out.println("-----");
        Student s2=  new Student("伍兹",18);
//        默认情况下,不同对象的哈希值是不相同的,方法重写可实现相同
        System.out.println(s2.hashCode());//1163157884
        System.out.println("-----");
        System.out.println("集合".hashCode());
        System.out.println("你好".hashCode());
        System.out.println("很好".hashCode());
    }
}
