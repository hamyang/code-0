import java.util.Scanner;

public class 杨辉三角 {
    public static void main(String[] args) {
        int a;//为杨辉三角形行数=列数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        a = sc.nextInt();
        if (a <= 0) {
            System.out.println("输入有误");
            System.exit(1);
        }

        int[][] num = new int[a][a];
        System.out.println(num[0][0] = 1);
        for (int i = 1; i < a; i++) {

            num[i][0] = 1;//每行循环一次
            System.out.print(num[i][0]);

            num[i][i] = 1;//每行循环一次

            //每行循环i次
            for (int a1=1;a1<i;a1++){
                num[i][a1] = num[i-1][a1-1] + num[i-1][a1];
                System.out.print("->"+num[i][a1]);
            }

            System.out.println("\t"+num[i][i]);

        }
    }
}









