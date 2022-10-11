import java.util.Scanner;

public class 大数加法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        System.out.println(addNum(num1, num2));
    }

    public static String addNum(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;//表示进位
        StringBuffer ans = new StringBuffer();
        //i>=0 || j>=0 || add!=0 分别表示1.num1的位数没加完，2.num2的位数没加完,3.两个数都加完，但是有进位的情况
        while (i >= 0 || j >= 0 || add != 0) {
            //此处以x为例子，如果j>=0,就返回num1.charAt(i) - '0'，否则就返回0。再将返回值赋值给x
            //如果i>=0 表示num1的位数没用完，直接将当前位的值赋值给x。否则就给x赋值为0，不影响后面的x+y。

            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int reslut = x + y + add;
            ans.append(reslut % 10);//将当前位数的x，y之和取个位赋值给最终答案ans
            add = reslut / 10;//记录是否有进位
            i--;
            j--;
        }
        //由于ans中的位置是个位在前高位在后，所以要反转一下
        ans.reverse();
        //返回
        return ans.toString();

    }
}