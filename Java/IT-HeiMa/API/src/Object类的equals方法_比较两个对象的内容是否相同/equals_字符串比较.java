package Object类的equals方法_比较两个对象的内容是否相同;

public class equals_字符串比较 {
    public static void main(String[] args) {
        char[] chs = {'a','b','c','d'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
