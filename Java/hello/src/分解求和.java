import java.util.Scanner;

public class 分解求和 {
    public static void main(String[] args) {
        String num;
        int b = 1;
        int f = 0;
        int g=0,sb, d;
        Scanner sc = new Scanner(System.in);
        //输入数字
        String line = sc.nextLine();
        //计算该数字长度
        num = String.valueOf(line.length());
        //类型转换
        int e = Integer.parseInt(line);
        //
        int abd = Integer.parseInt(num);
        //解决0的位数循环
        for (int i = 0; i < abd - 1; i++) {
            int a = 10;
            b *= a;
        }
        //强制转换num为字符串类型以判断其长度
        int v = Integer.parseInt(num);
        int hj=b;
        //e为最终数字1234-->d
        //b为最终长度1000
        //v为最终可执行数字长度4
        //计算求和
        for (; abd > 0; abd--) {
            //0的位数递减循环
            if (v != abd) {
                //对1000操作
                //取数字余
                d = e % hj;
                hj /=10;
                sb = d / hj;
                //累加求和
                f += sb;
            } else {
                //取第一位
                g = e / b;
            }
        }
        System.out.println(f + g);
    }
}
