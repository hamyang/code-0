package 跳转控制语句;
//break 终止循环体内容的执行，也就是结束当前整个循环
public class break语句 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
