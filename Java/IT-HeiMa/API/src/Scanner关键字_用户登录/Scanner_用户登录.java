package Scanner关键字_用户登录;

import java.util.Scanner;

public class Scanner_用户登录 {
    public static void main(String[] args) {

        String username = "xtq";
        String password = "hy064872";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                if (i-2 == 0){
                    System.out.println("你的账户已被锁定，请联系管理员恢复");
                }else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                }
            }


        }
    }
}
