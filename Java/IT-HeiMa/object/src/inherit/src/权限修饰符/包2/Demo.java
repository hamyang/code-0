package 权限修饰符.包2;
//不同包下无关类
import 权限修饰符.包1.Fu;

public class Demo {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show4();
    }
}
