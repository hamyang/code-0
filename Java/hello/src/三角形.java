import java.util.Scanner;

public class 三角形 {
    public static void main(String[] args) {
        int[] data = new int[3];
        final Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三条边(cm)");
        for (int x = 0; x < data.length; x++) {
            data[x] = sc.nextInt();
            if (data[x]<=0) {
                System.exit(0);
            }
        }
        int num1 = data[0];
        int num2 = data[1];
        int num3 = data[2];

//            判断是否是三角形
        if (num1 + num2 <= num3 || num1 + num3 <= num2 || num2 + num3 <= num1) {
            System.out.println("输入的3条边不能组成三角形");
            System.exit(0);//jvm退出
//            判断是否是等边三角形
        }
        if (num1 == num3 && num2 == num3) {
            System.out.println("该三角形是等边三角形");
//            判断是否为等腰三角形
        }else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("该三角形是等腰三角形");
//            判断是否是直角三角形
        }else if (num1 * num1 + num2 * num2 == num3 * num3 || num1 * num1 + num3 * num3 == num2 * num2 || num2 * num2 + num3 * num3 == num1 * num1) {
            System.out.println("该三角形是直角三角形");
        } else {
            System.out.println("该三角形是普通三角形");
        }
        int a = num1 + num2 + num3;
        double i = (a - num1) * (a - num2) * (a - num3);
        System.out.println("三角形的周长为" + a + "cm");
        System.out.println("三角形面积为" + String.format("%.2f", Math.sqrt(i)) + "cm");

    }
}
