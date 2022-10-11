package Scanner关键字_用户登录;

import java.util.Scanner;

public class scanner关键字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串数据");
//        自动生成左边内容ctrl+alt+v
        String line = sc.nextLine();

        System.out.println(line);
    }
}
