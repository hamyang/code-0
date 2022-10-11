package if语句;
import  java.util.Scanner;
public class 基偶数 {  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    int x = sc.nextInt();
    if(x!=0) {
        if (x % 2 == 0) {
            System.out.println("这个数是偶数");
        } else {
            System.out.println("这个数是基数");
        }
            }
    else System.out.println("0既不是基数也不是偶数");
}
}
