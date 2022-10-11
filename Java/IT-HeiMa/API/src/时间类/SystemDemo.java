package 时间类;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        //public static void exit (int status):终止当前运行的Java虚拟机，非0表示异常终止
        System.out.println("结束");
        //public static long currentTimeMilis():返回当前时间(毫秒为单位)，起始时间为1970年
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        //查看代码运行时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");

    }
}
