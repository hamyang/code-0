package 字符串中数据排序.基本类型包装类;
//Integer是int的包装类类型,已过时推荐使用valueOf
public class IntegerDemo {
    public static void main(String[] args) {
//    判断一个数据是否在int范围内
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("-----");

//         Integer
        Integer i1 = new Integer(100);
        System.out.println(i1);
        Integer i2 = new Integer("100");
//        Integer i2 = new Integer("100");应该由数字组成的字符串,如：abc不行
        System.out.println(i2);
        System.out.println("-----");

//        Integer
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);
    }
}