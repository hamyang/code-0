public class 兑换方案 {
    public static void main(String[] args) {
        //一元5角等于150分
        int a;//5分
        int b;//3分
        int c;//1分
        int i=0;//个数
//        5*a+3*b+c=150; 若共150分加上
        for (a = 0; a < 30; a++) {
            c=0;
            for (b = 0; b < 50; b++) {
                c++;
                if (a!=0&&b!=0&&a+b+c==100) {
                    i++;
                    System.out.println("第" + i + "种方案" + "5分 " + a + " 枚 " + "3分 " + b + " 枚 " + "1分 " + c + " 枚 ");
                }
            }
        }
    }
}
