package Rando随机数获取;
//导包
import java.util.Random;
public class hello {
    public static void main(String args[]){
        //创建对象
        Random r = new Random();
        //获取随机数
        int number = r.nextInt(10);
        System.out.println(number);
    }
}
