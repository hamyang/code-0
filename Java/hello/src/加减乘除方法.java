import java.util.Scanner;

public class 加减乘除方法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Air1(a, b));
        System.out.println(Air2(a, b));
        System.out.println(Air3(a, b));
        System.out.println(Air4(a, b));
    }

    public static int Air1(int a, int b) {
        return a + b;
    }

    public static int Air2(int a, int b) {
        return a - b;
    }

    public static int Air3(int a, int b) {
        return a * b;
    }

    public static int Air4(int a, int b) {
        return a / b;
    }
}
