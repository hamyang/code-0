package StringBuilder类;
/*StringBuilder是一个可变的字符序列。此类提供一个与 StringBuffer 兼容的 API，但不保证同步。
该类被设计用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候（这种情况很普遍）。*/
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(1);
//        在开头位置添加
        s.append("cd");
        System.out.println(s);
//        添加在2的位置添加整形
        s.insert(2,5);
        System.out.println(s);
//        添加在2的位置添加字符串
        s.insert(2,"hello");
        System.out.println(s);
//        删除2~6的位置；
        s.delete(2,6);
        System.out.println(s);
    }
}
/*StringBuilder sb = new StringBuilder();
// 对象名.length() 序列长度
System.out.println(sb.length());  // 0
// 对象名.append() 追加到序列
sb.append("hello");
System.out.println(sb);  // hello
// 97代表的是是'a'
sb.appendCodePoint(97);
System.out.println(sb);  // helloa
// 链式编程
sb.append(1).append("world").append(2);
System.out.println(sb);  // helloa1world2
// 索引是5的位置替换成空格
sb.setCharAt(5, ' ');
System.out.println(sb);  // hello 1world2
// 指定位置0前插入0
sb.insert(0, 0);
System.out.println(sb);  // 0hello 1world2
// 删除索引6(包含)至索引14(不包含)的字符串
sb.delete(6, 14);
System.out.println(sb);  // 0hello
// StringBuilder类型转换成String类型
String s = sb.toString();
System.out.println(s);  // 0hello

// 以及还有截取、反转、替换等方法
*/