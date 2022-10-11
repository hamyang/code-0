package 字符串中数据排序.基本类型包装类;

public class int和String的互换 {
    public static void main(String[] args) {
        //int -- String
        int number = 100;
        String s2 = String.valueOf(number);
        System.out.println(s2);

        //String --- int
        String s = "100";
        int y = Integer.parseInt(s);
        System.out.println(y);


    }
}
