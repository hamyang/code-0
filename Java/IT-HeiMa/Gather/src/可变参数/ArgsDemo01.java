package 可变参数;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
    }
//一个数组如果有多个参数可变参数要放在后面
//改进
    public static int sum(int b,int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    public static int sum(int a, int b,int c) {
//        return a + b+c;
//    }
}
