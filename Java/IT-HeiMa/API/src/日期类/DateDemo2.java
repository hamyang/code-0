package 日期类;
//public long getTime():获取的对象从1970年1月1日00：00：00到现在的毫秒值
//public void setTime(long tine):设置时间，给的是毫秒值

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
 //public long getTime():获取的恶气对象从1970年1月1日00：00：00到现在的毫秒值

        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getTime() / (1.0 * 1000 * 60 * 60 * 24 * 365)+"年");
//public void setTime(long tine):设置时间，给的是毫秒值
        //long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
