package 基础知识练习;

public class 百钱白鸡 {
    public static void main(String[] args) {
        double y = 0;
        double z = 0;
        for (double x = 0; x <= 100; x++) {
            if (y > 100) {
                y = 0;
            }
            while (y <= 100) {
                if (z > 100) {
                    z = 0;
                }
                while (z <= 100) {
                    if (x + y + z == 100 /*钱*/ && x / 5 + y / 3 + z * 3 == 100) {
                        System.out.print("鸡翁有" + x / 5 + "只");
                        System.out.print("母鸡有" + y / 3 + "只");
                        System.out.println("鸡雏有" + z * 3 + "只");

                    }
                    z++;
                }
                y++;
            }
        }
    }
}