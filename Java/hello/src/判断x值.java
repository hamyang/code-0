import java.util.Scanner;

public class 判断x值 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int num = sc.nextInt();
        if (num == 1 || num == 5 || num == 10) {
            switch (num) {
                case 1:
                    System.out.println("1");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 10:
                    System.out.println("10");
                    break;
            }
        }else{
            System.out.println("x=none");
        }

    }
}
