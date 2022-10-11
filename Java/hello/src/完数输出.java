import java.util.ArrayList;
import java.util.Scanner;

public class 完数输出 {
    //    public static void main(String[] args) {
//        int h = 0;
//        int l = 0;
//        int n = 0;
//        int s = 0;
//        int a, b;
//        int c = 0;
//        ArrayList<Integer> array1 = new ArrayList<>();//存储完数
//        ArrayList<Integer> array2 = new ArrayList<>();//存储单个完数的所有因子
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个大于0的数");
//        int num = sc.nextInt();
//        if (num <= 0) {
//            System.out.println("输入有误");
//            System.exit(0);
//        }
//
//        //            内部循环
//        while (n == 0) {
//            a = 0;
//            //对a加到小于c
//            for (; a < c; a++) {
//                b = 1;
//                //对b加到小于c
//                while (b < c) {
//                    b++;
//                    //把满足的因子存入一个数组
//                    if (a * b == c) {
//                        array2.add(a);
//                        array2.add(b);
//                        //            判断是否是完数
//                        for (; s < array2.size(); s++) {
//                            l += array2.get(s);
//                        }
//                        //            储存单个完数
//                        if (l == c) {
//                            array1.add(c);
//                        }
//
//                    }
//                }
//
//            }
//            //            删除数组内容
//            for (; h < num; h++) {
//                System.out.println(array2.set(h, Integer.valueOf("javaee")));
//                System.out.println(array2);
//            }
//            //-----------------------------
//            c++;
//            //判断是否满足退出循环条件
//            if (c == num) {
//                n = 1;
//            }
//        }
////            输出完数
//        for (int j = 0; j < 100; j++) {
//            System.out.println(array1.add(j));
//        }
//    }
//    战略性放弃这个方法~~~
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于0的数,将会输出其范围内的完数");
        int num = sc.nextInt();
        for (int h = 1; h <= num; h++) {
            int b = 0;
            for (int i = 1; i <= h / 2 + 1; i++) {
                if (h % i == 0) {
                    b += i;
                }
            }
            if (b == h) {
                System.out.println(h);
            }
        }
    }
}