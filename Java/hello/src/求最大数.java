import java.util.Scanner;

public class 求最大数 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sun(a,b,c);
    }

    private static void sun(int a,int b,int c) {
        int i=Math.max(c,Math.max(a,b));
        System.out.println(i);
    }
}
