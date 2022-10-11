import java.util.Scanner;

public class 学生成绩 {
    public static void main(String[] args) {
        double a = 0;//a为总成绩
        int b = 0;//统计输入次数
        double c;//c为平均分
        int i = 0;
        int s1 = 0;
        double[] array1 = new double[10];//存储所有分数
        double[] array2 = new double[10];//存储大于平均分的分数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生成绩，以输入负数结束,不能超过100个");
        while (true) {
            double num = sc.nextDouble();
            if (num < 0) {
                break;
            }
            array1[i] = num;
            a += num;
            b++;
            i++;
        }
        c = a / b;
        for (int s = 0; s < array1.length; s++) {
            if (array1[s] > c) {
                array2[s1] = array1[s];
                s1++;
            }
        }
        System.out.println("高于平均分的成绩有:");
//        遍历array2
        for (double k : array2) {
            if (k == 0) {
                break;
            }
            System.out.print(k + ",");
        }
        System.out.println();
        System.out.println("学生平均成绩为" + String.format("%.2f", c));
    }
}
