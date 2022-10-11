package StringBuilder类;
import java.lang.StringBuilder;
public class StringBuilder_添加和反转方法 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb=new StringBuilder();
        //append  添加数据，并返回对象本身
        StringBuilder sb2 = sb.append("hello");
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb==sb2);

        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append("100");
        System.out.println(sb);

        //链式编程
        sb.append("hello").append("world").append("java").append("100");
        System.out.println(sb);


    }
}
