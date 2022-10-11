package for语句;

public class 统计 {
    public static void main(String args[]){
        int count = 0;
        for(int i=100;i<=999;i++){
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10 % 10;
            if (a*a*a + b*b*b + c*c*c == i){
            count = count +1;
            }

        }
        System.out.println("水仙花数一共有"+count+"个");
    }
}
