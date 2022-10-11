package 特殊操作流.游戏次数;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        Random r = new Random();//随机生成数字
        int number = r.nextInt(100) + 1;//范围
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("中了");
                break;
            }
        }
    }

}
