package 异常;
//java异常分为2大类，编译异常和运行时异常，也被称为受检异常和非受检异常
//所有的RuntimeException 类及其子类的实列被称为运行时异常，其他的异常都是编译时异常

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//编译时异常，必须显示处理，否则程序就会出错，无法通过编译
//运行时异常，无需显显示处理，也可以和编译时异常一样处理
public class 编译时异常与运行是异常区别 {
    public static void main(String[] args) {
        method();
        method2();
    }
    //编译时异常
    public static void method() {
        try {
            String s = "2022-04-01";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //运行时异常
    public static void method2() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
//总结
//throws 用在方法声明后面，跟的时异常类名
//       表示抛出异常，由该方法的调用者来处理
//       表示出现异常的一种可能性，并不一定会发生这些异常
//throw  用在方法体内，跟的是异常对象名
//       表示抛出异常，由方法体内的语句处理、
//       执行throw一定抛出了某种异常