import java.util.Scanner;

public class 阶乘求和 {
    public static void main(String[] args) {
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小于等于50的数");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int a=jc(i);
            b+=a;
        }
        System.out.println(b);
    }

    public static int jc(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * jc(i - 1);
        }

    }
}
