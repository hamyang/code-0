import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        int randNum;//系统生成的随机数
        int guess;//用户输入的数字
        int count = 0;//执行次数
        while (true) {
            Random rand = new Random();
            randNum = rand.nextInt(100) + 1;
            do {
                System.out.println("请输入你输入的数字");
                Scanner in = new Scanner(System.in);
                guess = in.nextInt();
                if (guess > randNum) {
                    System.out.println("大了");
                } else if (guess < randNum) {
                    System.out.println("太小");
                }
                count++;
            } while (guess != randNum);
            switch (count) {
                case 1:
                    System.out.println("上帝");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("smart");
                    break;
                default:
                    System.out.println("stupid");
                    break;
            }
            System.out.println("是否继续游戏？");
            System.out.println("是按1，否按任意数");
            Scanner sc = new Scanner(System.in);
            String s = String.valueOf(sc.nextInt());
            int a = Integer.parseInt(s);
            if (a == 1) {
                System.out.println("请继续游戏");
            } else {
                System.exit(0);
            }
        }
    }
}


//next()返回的值为字符串，但nextInt()的返回值为数值型，而nextLine()和next()返回值的类型一致，均为字符串型。
