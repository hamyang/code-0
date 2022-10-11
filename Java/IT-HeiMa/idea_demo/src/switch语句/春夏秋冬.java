package switch语句;
import java.util.Scanner;
public class 春夏秋冬 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week) {
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬");
                break;
            default:
                System.out.println("输入错误");


        }
    }



}
