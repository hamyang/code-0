package Math类_对字符串的各种操作;

public class MathDemo {
    public static void main(String[] args) {
//        public static int abs (int a):  返回参数绝对值
        System.out.println(Math.abs(66));
        System.out.println(Math.abs(-66));
        System.out.println("-----");
//        public static double ceil (double a):返回大于或等于参数的最小值，等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("-----");
//        public static double floor (double a):返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("-----");
//        public static int round (float a):按照四舍五入返回最接近参数的int
        System.out.println(Math.round(66.88));
        System.out.println("-----");
//        public static int Max (int a,int b):返回两个int值中的较小值

//        public static double pow(double a,double b):返回a的b次幂的值
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("-----");
//        public static double random():返回的值为double的正值，
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
    }
}
