package 异常;
/*f方法一：try{
        可能出现异常的代码;
        }catch(异常类名 变量名){
            异常的处理代码;
            }
*/
//方法二：throws 异常名  这个格式跟在方法的括号后面
//如：public static void method2()throws ParseException{}

//public String getMessage():返回此throwable 的详细信息字符串
//public String toString():返回此可抛出的简短描述
//public void printStackTrace():把异常的错误信息输出在控制台
public class 异常处理 extends Throwable {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {//new ArrayIndexOutOfBoundsException();
            //System.out.println("你访问的数组的索引不存在");//建议用下面方式调方法

            //public String getMessage():返回此throwable 的详细信息字符串
            //System.out.println(e.getMessage());//出现异常的原因

            // public String toString():返回此可抛出的简短描述
            //System.out.println(e.toString());//出现异常原因和类名

            // public void printStackTrace():把异常的错误信息输出在控制台
            //e.printStackTrace();//出现异常类名异常原因异常的位置信息
        }
    }
}
/*   public class Throwable{
            private String detailMessage;
            public Throwable(String message){
                detailMessage = message;
                }
            public String getMessage() {
            return detailMessage;}
    }*/