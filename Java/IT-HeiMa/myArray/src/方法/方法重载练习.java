package 方法;

public class 方法重载练习 {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare(10L, 20L));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short)20));

    }
    public static boolean compare(int a,int b){
        return a == b;
    }
    public static boolean compare(long a,long b){
        return a == b;
    }
    public static boolean compare(byte a,byte b){
        return a == b;
    }
    public static boolean compare(short a,short b){
        return a == b;
    }
}
