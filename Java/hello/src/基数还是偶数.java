import java.util.Scanner;

public class 基数还是偶数 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while (true) {
            final int num = sc.nextInt();
            if (num < 0) {
                System.out.println("输入有误,请重新输入");
            }else if (num==0){
                System.out.println("0既不是基数也不是偶数");
                break;
            }else if(num%2==0){
                System.out.println("是偶数");
                break;
            }else {
                System.out.println("是基数");
                break;
            }
        }
    }
}
