import java.util.Scanner;

public class 能否被5整除 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 5 == 0)
        {
            //能被5整除
            if(num % 6 == 0)
            {
                System.out.println("能被5或6整除");
            }
            else
            {
                System.out.println("能被5整除");
            }
        }
        else
        {
            //不能被5整除
            if(num % 6 != 0)
            {
                System.out.println("不能被5或6整除");
            }
            else
            {
                System.out.println("能被6整除");
            }
        }
    }
}
