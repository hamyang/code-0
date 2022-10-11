package 权限修饰符.包2;
//不同包的子类
import 权限修饰符.包1.Fu;

public class Zi extends Fu{
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show3();
        z.show4();

    }
}
