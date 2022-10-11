import java.util.Scanner;

public class 圆的周长 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入半径");
        final String srad = in.nextLine();
        int rad = Integer.parseInt(srad);
        final double PI = 3.1415;
        final double length = (2 * PI * rad);
        System.out.println("圆的周长是："+length);
    }
}
