import java.util.Scanner;

public class 失足的蚂蚁 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入矩阵行数m=");
        int m = sc.nextInt();
        System.out.print("请输入矩阵列数n=");
        int n = sc.nextInt();
        int[][] num = new int[m][n];
        int x = 1;
        int y = 1;
        while (true) {
            for (; x <=n; x++) {
                for (; y <= m; y++) {
                    System.out.print("("+x + "," + y+")" + "->");
                    if (x == n && y == m) {
                        System.out.println("("+x + "," + y+")");
                        System.exit(1);
                    }
//                    if (x == n ||y == m){
//                        System.out.println();
//                    }

                    if (y==m){
                        y=0;
                        break;
                    }
                }
            }
        }
    }
}
