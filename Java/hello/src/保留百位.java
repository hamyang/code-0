import java.util.Scanner;

public class 保留百位 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个五位数");
        final String sum = in.nextLine();
        int num= Integer.parseInt(sum);
        int a = (num /100);
        System.out.println(a);
    }
}
/*import java.util.Scanner;

public class cutNum2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入5位整数：");
        String  sum = in.nextLine();
        String s = sum.substring(0,3);
        System.out.println("保留到百位："+s);
    }
}*/