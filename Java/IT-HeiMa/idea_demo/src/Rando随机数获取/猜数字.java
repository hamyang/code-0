package Rando随机数获取;
import java.util.Random;
public class 猜数字 {
    public static void main(String args[]){
        int a=66;
        Random r = new Random();
        int number = r.nextInt(100);
        if(number>a){
            System.out.println("猜的数据大了");
        }
        if(number<a){
            System.out.println("猜的数据小了");
        }if(number==a){
            System.out.println("恭喜你猜中了");
        }

    }
}
