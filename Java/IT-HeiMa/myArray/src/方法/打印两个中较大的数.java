package 方法;

public class 打印两个中较大的数 {
    public static void main(String[] args) {
    getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        int getMax = a > b ? a :b;
        System.out.println(getMax);

    }
}
