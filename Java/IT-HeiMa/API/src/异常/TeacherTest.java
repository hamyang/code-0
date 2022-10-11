package 异常;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();

        Teacher t = new Teacher();

        try {
            t.checkScore(score);
        } catch (自定义异常 e) {
            e.printStackTrace();
        }

    }
}
