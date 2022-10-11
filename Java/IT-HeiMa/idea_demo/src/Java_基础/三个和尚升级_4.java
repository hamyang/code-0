package Java_基础;
import java.util.Scanner;
public class 三个和尚升级_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();
        int height4 = height1 > height2 ? height1 : height2;
        int height5 = height4 > height3 ? height4 : height3;



        System.out.println("最高height:" + height5);
    }
}
