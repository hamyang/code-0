package if语句;
import  java.util.Scanner;
public class 星期几 {
    public static void main (String[] args) {
        System.out.println("请输入1~7的数");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        if (x==1) {
            System.out.println("今天星期一");
        }else if(x==2){
            System.out.println("今天星期二");
        }else if(x==3){
            System.out.println("今天星期三");
        }else if(x==4){
            System.out.println("今天星期四");
        }else if(x==5){
            System.out.println("今天星期五");
        }else if(x==6){
            System.out.println("今天星期六");
        }else if(x==7){
            System.out.println("今天星期天");
        }else{
            System.out.println("输入有误!!!");
        }
    }
}
